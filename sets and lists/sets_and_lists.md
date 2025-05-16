# Sets and Lists in Java

Java provides several collection types for storing groups of objects. Two of the most commonly used are `List` and `Set`.

## List
A `List` is an ordered collection that can contain duplicate elements. The most commonly used implementation is `ArrayList`.

### Example: Using an ArrayList
```java
import java.util.List;
import java.util.ArrayList;

List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Alice"); // Duplicate allowed
for (String name : names) {
    System.out.println(name);
}
```

## Set
A `Set` is a collection that cannot contain duplicate elements. The most commonly used implementation is `HashSet`.

### Example: Using a HashSet
```java
import java.util.Set;
import java.util.HashSet;

Set<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // Duplicate ignored
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

## Differences Between List and Set
- **List** allows duplicates and maintains insertion order.
- **Set** does not allow duplicates and does not guarantee order (except for some implementations like `LinkedHashSet`).

## Conclusion
Use a `List` when you need an ordered collection with possible duplicates. Use a `Set` when you need unique elements. 