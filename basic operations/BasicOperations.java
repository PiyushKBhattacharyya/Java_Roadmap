public class BasicOperations {
    public static void main(String[] args) {
        // Arithmetic Operations
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        // Relational Operations
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // Logical Operations
        boolean result1 = (a > 5 && b < 5); // true
        boolean result2 = (a > 5 || b > 5); // true
        boolean result3 = !(a > 5);         // false
        System.out.println("(a > 5 && b < 5): " + result1);
        System.out.println("(a > 5 || b > 5): " + result2);
        System.out.println("!(a > 5): " + result3);

        // Assignment Operations
        int x = 5;
        x += 3; // x = 8
        x *= 2; // x = 16
        System.out.println("x after += and *= : " + x);
    }
} 