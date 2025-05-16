import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class SetsAndListsExample {
    public static void main(String[] args) {
        // List example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicate allowed
        System.out.println("List elements:");
        for (String name : names) {
            System.out.println(name);
        }
        
        // Set example
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate ignored
        System.out.println("Set elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
} 