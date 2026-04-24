import java.util.Scanner;

// Class to print multiplication table from 6 to 9
class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;

            // Print multiplication table
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}