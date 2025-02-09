const axios = require("axios");
const protobuf = require("protobufjs");

// Replace with your private key
const PRIVATE_KEY = "YOUR_PRIVATE_KEY";
const API_URL = "https://api.delhitransit.com/api/realtime/VehiclePositions.pb";

// Load the GTFS Realtime proto file
protobuf.load("gtfs-realtime.proto", (err, root) => {
  if (err) {
    console.error("Failed to load proto file:", err);
    return;
  }

  // Get the FeedMessage type from the proto file
  const FeedMessage = root.lookupType("transit_realtime.FeedMessage");

  // Fetch real-time data from the API
  axios
    .get(`${API_URL}?key=${PRIVATE_KEY}`, {
      responseType: "arraybuffer", // Ensure binary data is returned
    })
    .then((response) => {
      // Decode the binary data using the FeedMessage type
      const message = FeedMessage.decode(new Uint8Array(response.data));

      // Convert the message to a JSON object
      const decodedData = FeedMessage.toObject(message, {
        longs: String, // Convert long values to strings
        enums: String, // Convert enums to strings
        bytes: String, // Convert bytes to strings
      });

      // Process and display the decoded data
      decodedData.entity.forEach((entity) => {
        if (entity.vehicle) {
          const vehicle = entity.vehicle;
          console.log("Vehicle ID:", vehicle.vehicle.id);
          console.log("Trip ID:", vehicle.trip.trip_id);
          console.log("Route ID:", vehicle.trip.route_id);
          console.log(
            "Position:",
            vehicle.position.latitude,
            vehicle.position.longitude
          );
          console.log("Timestamp:", new Date(vehicle.timestamp * 1000));
          console.log("-".repeat(20));
        }
      });
    })
    .catch((error) => {
      console.error("Failed to fetch or decode data:", error);
    });
});