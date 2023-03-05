package list;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        /**
         *  return -1 if this < other
         *  return 0 if this == other
         *  return 1 if this > other
         */
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
