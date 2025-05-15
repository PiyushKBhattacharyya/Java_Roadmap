# Input and Scanners in Java

In Java, user input is commonly handled using the `Scanner` class, which is part of the `java.util` package. The Scanner class allows you to read different types of input from the keyboard, such as strings, integers, and floating-point numbers.

## Importing the Scanner Class
To use the Scanner class, you need to import it at the beginning of your Java program:

```java
import java.util.Scanner;
```

## Creating a Scanner Object
You can create a Scanner object to read input from the standard input stream (keyboard):

```java
Scanner scanner = new Scanner(System.in);
```

## Reading Different Types of Input
- **String Input:**
  ```java
  String name = scanner.nextLine();
  ```
- **Integer Input:**
  ```java
  int age = scanner.nextInt();
  ```
- **Double Input:**
  ```java
  double salary = scanner.nextDouble();
  ```

## Example: Reading User Input
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        scanner.close();
    }
}
```

## Conclusion
The Scanner class is a powerful and flexible way to handle user input in Java. Always remember to close the Scanner object after use to free up resources. 