# Conditions and Booleans in Java

Conditional statements and boolean logic are fundamental for controlling the flow of a Java program. They allow you to execute different code blocks based on certain conditions.

## Boolean Values
A boolean in Java can be either `true` or `false`:

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
```

## if, else if, and else Statements
These statements let you execute code based on conditions:

```java
int number = 10;
if (number > 0) {
    System.out.println("Positive number");
} else if (number < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}
```

## The switch Statement
The `switch` statement is useful when you have multiple possible values for a variable:

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

## Combining Conditions with Booleans
You can combine multiple conditions using logical operators:

```java
int age = 20;
boolean hasID = true;
if (age >= 18 && hasID) {
    System.out.println("Entry allowed");
} else {
    System.out.println("Entry denied");
}
```

## Conclusion
Conditional statements and boolean logic are essential for making decisions in your Java programs. Mastering them will help you write more flexible and powerful code. 