# Arrays in Java

Arrays are used to store multiple values of the same type in a single variable, instead of declaring separate variables for each value.

## Declaring and Initializing Arrays
You can declare an array and initialize it with values:

```java
int[] numbers = {1, 2, 3, 4, 5};
```
Or declare an array and assign values later:
```java
String[] names = new String[3];
names[0] = "Alice";
names[1] = "Bob";
names[2] = "Charlie";
```

## Accessing Array Elements
Array elements are accessed by their index (starting from 0):

```java
System.out.println(numbers[0]); // 1
System.out.println(names[2]);   // Charlie
```

## Iterating Over Arrays
You can use a loop to iterate over array elements:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
Or use an enhanced for loop:
```java
for (String name : names) {
    System.out.println(name);
}
```

## Example: Working with Arrays
```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```

## Conclusion
Arrays are a fundamental data structure in Java, allowing you to efficiently store and manipulate collections of data. 