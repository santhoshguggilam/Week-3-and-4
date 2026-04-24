import java.util.Scanner;

// Class to print odd and even numbers up to a given number
class OddEvenPrinter {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }

        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}