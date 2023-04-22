package Task1;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

    public void workWithArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("grape");
        list.add("honeydew");
        list.add("kiwi");
        list.add("lemon");

        // Add an element to the ArrayList
        list.add("mango");

        // Iterate through the ArrayList by using Iterator object
        System.out.println("Iterating through the ArrayList:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        list.add(3, "orange");

        // Remove an element from the ArrayList, Remove at an index Update the element at a specific index
        System.out.println("Removing an element from the ArrayList:");
        list.remove("banana");
        list.remove(7);
        list.set(2, "coconut");

        // Check the element is present at a particular index
        System.out.println("Checking the element at index 4:");
        if (list.contains("date")) {
            System.out.println("date is present at index " + list.indexOf("date"));
        } else {
            System.out.println("date is not present in the ArrayList");
        }

        // Get an element at a particular index
        System.out.println("Getting the element at index 6: " + list.get(6));

        // Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Check the given element is present in the ArrayList
        System.out.println("Checking if the element 'lemon' is present in the ArrayList: " + list.contains("lemon"));

        // Remove all elements of the ArrayList
        list.clear();
        System.out.println("After removing all elements, size of the ArrayList: " + list.size() + "\n");
    }
}
