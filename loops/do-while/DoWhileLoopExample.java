import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Do-while loop: counting from 1 to 5
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // Do-while loop: user input validation
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("You entered: " + number);
        scanner.close();
    }
} 