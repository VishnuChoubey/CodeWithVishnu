import java.util.*;
public class Map {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"vishnu");
        map.put(2,"satyam");
        map.put(3,"choubey");
        map.put(4,"aman");
        
       
        Collection<String> col=map.values();
        List<String> list=new ArrayList<>();
        list.addAll(col);
        System.out.println(list);
        
    }
}
