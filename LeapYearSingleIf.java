import java.util.Scanner;

// Class to check Leap Year using single if condition
class LeapYearSingleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check Gregorian calendar validity first
        if (year < 1582) {
            System.out.println("Year should be >= 1582 (Gregorian calendar)");
        } 
        else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } 
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}