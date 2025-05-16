public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
} 