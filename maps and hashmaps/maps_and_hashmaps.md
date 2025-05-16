# Maps and HashMaps in Java

A `Map` is a collection that stores key-value pairs. The most commonly used implementation is `HashMap`.

## Map
A `Map` allows you to associate a value with a key. Keys must be unique, but values can be duplicated.

## HashMap
A `HashMap` is the most popular implementation of the `Map` interface. It does not maintain any order of its elements.

### Example: Using a HashMap
```java
import java.util.Map;
import java.util.HashMap;

Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 22);

for (String name : ages.keySet()) {
    System.out.println(name + " is " + ages.get(name) + " years old.");
}
```

## Iterating Over a HashMap
You can also iterate over the entries:
```java
for (Map.Entry<String, Integer> entry : ages.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

## Differences Between List, Set, and Map
- **List**: Ordered collection, allows duplicates, accessed by index.
- **Set**: Unordered collection, no duplicates, accessed by element.
- **Map**: Key-value pairs, keys are unique, values can be duplicated.

## Conclusion
Use a `Map` or `HashMap` when you need to associate unique keys with values, such as storing user information or configuration settings. 