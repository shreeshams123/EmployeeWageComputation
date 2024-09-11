import java.util.Scanner;

class EmployeeWageComputation {

    public static void main(String[] args) {
        // Constants
        final double FULL_TIME_HOURLY_WAGE = 20.0; // Hourly wage for full-time employees
        final double PART_TIME_HOURLY_WAGE = 15.0; // Hourly wage for part-time employees (example rate)
        final int DAILY_HOURS = 8; // Hours worked per day

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get employee type from user
        System.out.println("Enter employee type (full-time/part-time): ");
        String employeeType = scanner.nextLine().trim().toLowerCase();

        // Calculate daily wage based on employee type
        double dailyWage = 0.0;
        switch (employeeType) {
            case "full-time":
                dailyWage = FULL_TIME_HOURLY_WAGE * DAILY_HOURS;
                break;
            case "part-time":
                dailyWage = PART_TIME_HOURLY_WAGE * DAILY_HOURS;
                break;
            default:
                System.out.println("Invalid employee type. Please enter 'full-time' or 'part-time'.");
                return;
        }

        // Output the result
        System.out.println("Daily Wage for " + employeeType + " employee: $" + dailyWage);

        // Close the scanner
        scanner.close();
    }
}
