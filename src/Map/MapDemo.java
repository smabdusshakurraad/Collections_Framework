package Map;

import list.Customer;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        System.out.println(map.get("e1"));
        System.out.println(map.get("e10"));

        var unkown = new Customer("unknown", "");
        System.out.println(map.getOrDefault("e10", unkown));

        System.out.println(map.containsKey("e1"));

        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        for(var key : map.keySet()){
            System.out.println(key);
        }

        for(var entry : map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

        for( var customer : map.values()){
            System.out.println(customer);
        }
    }
}
