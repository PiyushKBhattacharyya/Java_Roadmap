# Nested Statements in Java

Nested statements are conditional statements placed inside other conditional statements. They are useful for making more complex decisions in your code.

## Nested if-else Statements
You can place one if-else statement inside another:

```java
int number = 15;
if (number > 0) {
    if (number % 2 == 0) {
        System.out.println("Positive and even");
    } else {
        System.out.println("Positive and odd");
    }
} else {
    System.out.println("Not positive");
}
```

## Nested switch Statements
You can also nest switch statements:

```java
int outer = 1;
int inner = 2;
switch (outer) {
    case 1:
        switch (inner) {
            case 1:
                System.out.println("Outer 1, Inner 1");
                break;
            case 2:
                System.out.println("Outer 1, Inner 2");
                break;
        }
        break;
    default:
        System.out.println("Other outer");
}
```

## Conclusion
Nested statements allow you to handle more complex logic by combining multiple conditions. However, be careful not to make your code too complex or hard to read. 