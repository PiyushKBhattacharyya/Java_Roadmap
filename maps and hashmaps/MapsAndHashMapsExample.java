import java.util.Map;
import java.util.HashMap;

public class MapsAndHashMapsExample {
    public static void main(String[] args) {
        // Creating and populating a HashMap
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);

        // Accessing values by key
        System.out.println("Alice is " + ages.get("Alice") + " years old.");

        // Iterating over keys
        System.out.println("All ages (by key):");
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }

        // Iterating over entries
        System.out.println("All ages (by entry):");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
} 