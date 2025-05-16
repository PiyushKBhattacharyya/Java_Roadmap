public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // inherited method
        myDog.bark();
    }
}

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