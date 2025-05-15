public class ConditionsExample {
    public static void main(String[] args) {
        // Boolean values
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // if, else if, else
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // switch statement
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

        // Combining conditions with booleans
        int age = 20;
        boolean hasID = true;
        if (age >= 18 && hasID) {
            System.out.println("Entry allowed");
        } else {
            System.out.println("Entry denied");
        }
    }
} 