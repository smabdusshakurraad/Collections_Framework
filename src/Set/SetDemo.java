package Set;

import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        Collection<String> collections = new ArrayList<>();
        Collections.addAll(collections, "a", "b", "c", "d", "c");
        Set<String> stringSet = new HashSet<>(collections);
        System.out.println(stringSet);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "b", "c"));
        System.out.println(set1);

        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println(set2);

        //set1.addAll(set2); // union operation
        // set1.retainAll(set2); // Intersections
        set1.removeAll(set2); // difference operation
        System.out.println(set1);


    }
}
