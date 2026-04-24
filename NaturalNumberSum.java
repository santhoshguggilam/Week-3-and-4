import java.util.Scanner;

// Class to check natural number and compute sum
class NaturalNumberSum {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a natural number (positive integer)
        if (number > 0) {

            // Calculate sum using formula
            int sum = number * (number + 1) / 2;

            // Display result
            System.out.println("The sum of " + number + " natural numbers is " + sum);

        } else {

            // Display message if not natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}