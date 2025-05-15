# While Loops in Java

A while loop is used to execute a block of code repeatedly as long as a given condition is true.

## Syntax
```java
while (condition) {
    // code block
}
```

## Example: Counting from 1 to 5
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## Do-While Loop
A do-while loop is similar to a while loop, but it executes the code block at least once before checking the condition.

## Syntax
```java
do {
    // code block
} while (condition);
```

## Example: Counting from 1 to 5
```java
int j = 1;
do {
    System.out.println(j);
    j++;
} while (j <= 5);
```

## Conclusion
While and do-while loops are useful for repeating tasks when the number of iterations is not known in advance. 