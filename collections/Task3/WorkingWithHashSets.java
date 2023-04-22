package Task3;

import java.util.HashSet;
import java.util.Iterator;
public class WorkingWithHashSets {

    public void setsOperations(){

        //sets does not hold duplicate values
        HashSet<String> set = new HashSet<String>();

        // Add 10 elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");
        set.add("fig");
        set.add("grape");
        set.add("honeydew");
        set.add("kiwi");
        set.add("lemon");

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Add an element to the HashSet
        set.add("mango");
        System.out.println("HashSet after adding an element: " + set);

        // Iterate through the HashSet using an Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if the HashSet contains an element
        boolean contains = set.contains("cherry");
        System.out.println("Does the HashSet contain 'cherry'? " + contains);

        // Check if the HashSet is empty
        boolean empty = set.isEmpty();
        System.out.println("Is the HashSet empty? " + empty);

        // Print the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // Remove an element from the HashSet
        set.remove("banana");
        System.out.println("HashSet after removing an element: " + set);

        // Create a copy of the HashSet
        HashSet<String> copySet = new HashSet<String>(set);
        System.out.println("Copy of the HashSet: " + copySet);

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing all elements: " + set);
    }
    }
