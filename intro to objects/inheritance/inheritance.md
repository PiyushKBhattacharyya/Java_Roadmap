# Inheritance in Java

Inheritance allows one class to acquire the properties and methods of another class. The class that inherits is called the subclass (child), and the class being inherited from is the superclass (parent).

## Syntax
```java
class Superclass {
    // fields and methods
}

class Subclass extends Superclass {
    // additional fields and methods
}
```

## Example: Inheritance
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // inherited method
        myDog.bark();
    }
}
```

## Conclusion
Inheritance promotes code reuse and establishes a relationship between classes. 