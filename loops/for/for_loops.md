# For Loops in Java

A for loop is used to execute a block of code a specific number of times. It is commonly used for iterating over arrays or ranges.

## Syntax
```java
for (initialization; condition; update) {
    // code block
}
```

## Example: Counting from 1 to 5
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## Example: Iterating Over an Array
```java
int[] numbers = {10, 20, 30};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

## Enhanced For Loop
Java also provides an enhanced for loop (for-each loop) for iterating over arrays:
```java
for (int num : numbers) {
    System.out.println(num);
}
```

## Conclusion
For loops are powerful for repetitive tasks and iterating over collections in Java. 