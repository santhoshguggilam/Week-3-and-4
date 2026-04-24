import java.util.Scanner;

// Class to check Leap Year using multiple if-else statements
class LeapYearMultipleConditions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Year should be >= 1582 (Gregorian calendar)");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}