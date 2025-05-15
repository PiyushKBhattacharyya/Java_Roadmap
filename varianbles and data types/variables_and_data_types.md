# Variables and Data Types in Java

Variables are containers for storing data values. In Java, every variable must be declared with a data type, which determines the kind of data it can hold.

## Declaring Variables
To declare a variable in Java, specify the data type followed by the variable name:

```java
int age;
String name;
```

You can also assign a value at the time of declaration:

```java
int age = 25;
String name = "Alice";
```

## Types of Variables
- **Local Variables:** Declared inside methods, constructors, or blocks.
- **Instance Variables:** Declared inside a class but outside any method. Each object has its own copy.
- **Static Variables:** Declared with the `static` keyword inside a class. Shared among all objects of the class.

## Data Types in Java
Java has two categories of data types:

### 1. Primitive Data Types
These are the most basic data types built into the language:

| Data Type | Size     | Description                  | Example         |
|-----------|----------|------------------------------|-----------------|
| byte      | 1 byte   | Whole numbers, -128 to 127   | byte b = 10;    |
| short     | 2 bytes  | Whole numbers, -32K to 32K   | short s = 1000; |
| int       | 4 bytes  | Whole numbers                | int i = 100;    |
| long      | 8 bytes  | Large whole numbers          | long l = 10000L;|
| float     | 4 bytes  | Decimal numbers (single)     | float f = 5.5f; |
| double    | 8 bytes  | Decimal numbers (double)     | double d = 10.99;|
| char      | 2 bytes  | Single character             | char c = 'A';   |
| boolean   | 1 bit    | true or false                | boolean flag = true;|

### 2. Non-Primitive Data Types
These include classes, arrays, and interfaces. The most commonly used non-primitive type is `String`:

```java
String message = "Hello, Java!";
int[] numbers = {1, 2, 3, 4};
```

## Example
```java
public class Example {
    public static void main(String[] args) {
        int age = 30;
        double salary = 50000.50;
        char grade = 'A';
        boolean isEmployed = true;
        String name = "John";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
}
```

## Conclusion
Understanding variables and data types is fundamental to programming in Java. They form the basis for storing and manipulating data in your programs. 