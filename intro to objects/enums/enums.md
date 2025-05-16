# Enums in Java

An enum (short for enumeration) is a special Java type used to define collections of constants.

## Syntax
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
```

## Example: Using an Enum
```java
public class Main {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        switch (today) {
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's not Friday.");
        }
    }
}
```

## Conclusion
Enums are useful for representing fixed sets of related constants, such as days of the week or directions. 