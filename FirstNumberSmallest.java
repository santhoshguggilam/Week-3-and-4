import java.util.Scanner;

// Class to check if the first number is the smallest
class FirstNumberSmallest {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Check if first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Display result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}