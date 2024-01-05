import java.util.*;

public class fruits_vector {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>(4);
        v.add("Banana");
        v.add("Jackfruit");
        v.add("Guava");
        v.add("Chicoo");
        System.out.println("Size of vector is: " + v.size());
        System.out.println("Default capacity is: " + v.capacity());
        System.out.println("Vector elements are: " + v);
        v.addElement("Papaya");
        v.addElement("Grape");
        v.addElement("Watermelon");
        System.out.println("Size after addition is: " + v.size());
        System.out.println("Capacity after addition is: " + v.capacity());
        System.out.println("Vector elements are: " + v);
        if (v.contains("Papaya")) {
            System.out.println("Papaya is present at index " + v.indexOf("Papaya") + ".");
        } else {
            System.out.println("Papaya is not present in the vector.");
        }
        System.out.println("First fruit in vector is: " + v.firstElement());
        System.out.println("Last fruit in vector is: " + v.lastElement());
    }
}
