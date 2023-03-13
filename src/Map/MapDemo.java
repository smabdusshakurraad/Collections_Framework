package Map;

import list.Customer;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

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
        // values
        for( var customer : map.values()){
            System.out.println(customer);
        }

        // Flight schedule problem understanding
        List<Customer> customers = Arrays.asList(new Customer("A", "E"),
                new Customer("A", "B"), new Customer("A", "C"), new Customer("B", "E"),
                new Customer("B", "D"), new Customer("B", "F"), new Customer("C", "B"));

        Set<String> customerNameSet = customers.stream().map(Customer::getName).collect(toSet());
        Map<String, Set<String>> customerNameMap = customers.stream().collect(groupingBy(Customer::getName,
                Collectors.mapping(Customer::getEmail, Collectors.toSet())));

        List<Customer> customersExtra = Arrays.asList(new Customer("A", "E"),
                new Customer("A", "B"), new Customer("A", null), new Customer("B", "E"),
                new Customer("B", "D"), new Customer("C", "B"));
        Map<String, Set<String>> customerExtraMap = customersExtra.stream()
                .collect(groupingBy(Customer::getName, Collectors.mapping(Customer::getEmail, toSet())));

        for (String name: customerNameSet) {
            customerNameMap.get(name).removeAll(customerExtraMap.get(name));
        }
        System.out.println(customerNameSet);
        for (String key: customerNameMap.keySet()) {
            System.out.println(customerNameMap.get(key));
            if(customerNameMap.get(key).size() > 0){
                customerNameSet.remove(key);
            }
        }
        System.out.println(customerNameSet);
    }
}
