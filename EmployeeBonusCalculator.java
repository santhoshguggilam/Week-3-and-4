import java.util.Scanner;

// Class to calculate employee bonus based on years of service
class EmployeeBonusCalculator {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Display bonus
        System.out.println("The bonus amount is INR " + bonus);
    }
}