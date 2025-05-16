# Method Overloading and Object Comparisons in Java

## Method Overloading
Method overloading allows a class to have more than one method with the same name, but different parameters (type, number, or both).

### Example: Method Overloading
```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
```

## Object Comparisons
- `==` checks if two references point to the same object.
- `.equals()` checks if two objects are logically "equal" (content equality).

### Example: Object Comparison
```java
String a = new String("hello");
String b = new String("hello");
System.out.println(a == b);        // false (different objects)
System.out.println(a.equals(b));   // true (same content)
```

## Conclusion
Use method overloading for flexibility, and use `.equals()` for content comparison between objects. 