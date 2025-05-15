public class ForLoopExample {
    public static void main(String[] args) {
        // Basic for loop: counting from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // For loop: iterating over an array
        int[] numbers = {10, 20, 30};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
} 