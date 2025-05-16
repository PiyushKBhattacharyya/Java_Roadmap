# Inner Classes in Java

An inner class is a class defined within another class. Inner classes can access members of the outer class, including private ones.

## Types of Inner Classes
- **Member Inner Class**
- **Static Nested Class**
- **Local Inner Class**
- **Anonymous Inner Class**

## Example: Member Inner Class
```java
class Outer {
    int x = 10;
    class Inner {
        void show() {
            System.out.println("x = " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
```

## Conclusion
Inner classes are useful for logically grouping classes and for accessing members of the outer class. 