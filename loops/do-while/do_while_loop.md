# Do-While Loop in Java

A do-while loop is similar to a while loop, but it always executes the code block at least once before checking the condition.

## Syntax
```java
do {
    // code block
} while (condition);
```

## Example: Counting from 1 to 5
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## Example: User Input Validation
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int number;
do {
    System.out.print("Enter a positive number: ");
    number = scanner.nextInt();
} while (number <= 0);
System.out.println("You entered: " + number);
scanner.close();
```

## Conclusion
The do-while loop is useful when you want to ensure the code block runs at least once, such as for input validation. 