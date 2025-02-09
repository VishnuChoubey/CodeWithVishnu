
import json
import bus_pb2  # Generated from your_schema.proto

# Load the binary data
with open('response.pb', 'rb') as f:
    binary_data = f.read()

# Decode the binary data
message = bus_pb2.YourMessageType()
message.ParseFromString(binary_data)

# Convert to JSON
json_data = json.loads(message.to_json())

print(json.dumps(json_data, indent=2))