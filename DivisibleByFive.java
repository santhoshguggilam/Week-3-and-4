import java.util.Scanner;

// Class to check divisibility by 5
class DivisibleByFive {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}