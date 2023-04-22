package Task2;

import java.util.*;
public class WorkingWithHashMap {

    public void hashMapOperations(){
        HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(101, "John");
        studentMap.put(102, "Alex");
        studentMap.put(103, "Bob");
        studentMap.put(104, "Cathy");
        studentMap.put(105, "David");
        studentMap.put(106, "Emma");
        studentMap.put(107, "Frank");
        studentMap.put(108, "Grace");
        studentMap.put(109, "Hannah");
        studentMap.put(110, "Isabella");

        // Insert a new key-value mapping into the map
        studentMap.put(111, "Jack");

        // Fetch the value of a key
        System.out.println("Value of key 106: " + studentMap.get(106));

        // Create a clone/copy of the HashMap
        HashMap<Integer, String> copyMap = new HashMap<Integer, String>(studentMap);

        // Check if the given key is in the map
        System.out.println("Is key 105 present in the map? " + studentMap.containsKey(105));

        // Check if the value is in the map
        System.out.println("Is value 'Cathy' present in the map? " + studentMap.containsValue("Cathy"));

        // Check if the map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // Print the size of the map to the console
        System.out.println("Size of the map: " + studentMap.size());

        // Print all the keys of the map to the console
        Set<Integer> keys = studentMap.keySet();
        System.out.println("Keys in the map: " + keys);

        // Remove a specific key-value pair
        studentMap.remove(108);

        // Copy all the elements of the map to another map
        HashMap<Integer, String> copiedMap = new HashMap<Integer, String>();
        copiedMap.putAll(studentMap);
        System.out.println("Copied map: " + copiedMap + "\n");
    }
}
