package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "a");
        System.out.println(list);

        list.add(0, "b");
        System.out.println(list);

        list.set(0, "a");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));

        System.out.println(list.subList(0,2));

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b","e3"));
        customers.add(new Customer("a","e2"));
        customers.add(new Customer("c", "e1"));
        System.out.println(customers);

        Collections.sort(customers);
        System.out.println(customers);

        customers.sort(new EmailCustomerComparator()); // similar to Collections.sort(customers, new EmailCustomerComparator());
        System.out.println(customers);
    }
}
