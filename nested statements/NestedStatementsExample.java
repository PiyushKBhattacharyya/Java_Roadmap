public class NestedStatementsExample {
    public static void main(String[] args) {
        // Nested if-else
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

        // Nested switch
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
    }
} 