# Basic Operations in Java

Java provides a variety of operators to perform basic operations on variables and values. These include arithmetic, relational, logical, and assignment operators.

## 1. Arithmetic Operations
Arithmetic operators are used to perform mathematical calculations:

| Operator | Description      | Example         |
|----------|------------------|-----------------|
| +        | Addition         | a + b           |
| -        | Subtraction      | a - b           |
| *        | Multiplication   | a * b           |
| /        | Division         | a / b           |
| %        | Modulus (remainder) | a % b       |

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

## 2. Relational Operations
Relational operators are used to compare two values:

| Operator | Description      | Example         |
|----------|------------------|-----------------|
| ==       | Equal to         | a == b          |
| !=       | Not equal to     | a != b          |
| >        | Greater than     | a > b           |
| <        | Less than        | a < b           |
| >=       | Greater or equal | a >= b          |
| <=       | Less or equal    | a <= b          |

```java
System.out.println(a == b); // false
System.out.println(a > b);  // true
```

## 3. Logical Operations
Logical operators are used to combine multiple conditions:

| Operator | Description      | Example         |
|----------|------------------|-----------------|
| &&       | Logical AND      | (a > 5 && b < 5) |
| ||       | Logical OR       | (a > 5 || b < 5) |
| !        | Logical NOT      | !(a > 5)         |

```java
boolean result = (a > 5 && b < 5); // true
System.out.println(result);
```

## 4. Assignment Operations
Assignment operators are used to assign values to variables:

| Operator | Description      | Example         |
|----------|------------------|-----------------|
| =        | Assign           | a = 5           |
| +=       | Add and assign   | a += 2 (a = a+2)|
| -=       | Subtract and assign | a -= 2      |
| *=       | Multiply and assign | a *= 2      |
| /=       | Divide and assign   | a /= 2      |
| %=       | Modulus and assign  | a %= 2      |

```java
int x = 5;
x += 3; // x = 8
x *= 2; // x = 16
System.out.println(x);
```

## Conclusion
Mastering these basic operations is essential for writing effective Java programs. They form the foundation for more complex logic and algorithms. 