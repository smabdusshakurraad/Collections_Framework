package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        System.out.println(collection);
        System.out.println(collection.contains("a"));

        collection.clear();

        System.out.println(collection);

        Collections.addAll(collection, "A", "B", "C");

        var objectsArray = collection.toArray();
        System.out.println(objectsArray[0]);

        var strings = collection.toArray(new String[0]);
        System.out.println(strings[0].toLowerCase());

        System.out.println(collection);

        var other = new ArrayList<String>();

        other.addAll(collection);

        System.out.println(other == collection);
        System.out.println(other.equals(collection));

        other.remove("B");

        System.out.println(other);

    }
}
