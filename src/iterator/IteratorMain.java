package iterator;

public class IteratorMain {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<String>();

        list.add("A");
        list.add("B");

        /**
         * this for each loop works like
         * Iterator iterator = list.iterator();
         * while(iterator.hasNext()){
         *      sout(iterator.next());
         * }
         */
        for (var item:
             list) {
            System.out.println(item);
        }
    }
}
