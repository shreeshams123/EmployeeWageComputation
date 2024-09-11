public class DailyEmployeeWage {

    public static void main(String[] args) {
        // Constants
        final double HOURLY_WAGE = 20.0; // Hourly wage in dollars
        final int DAILY_HOURS = 8;       // Hours worked per day

        // Calculate daily wage
        double dailyWage = HOURLY_WAGE * DAILY_HOURS;

        // Output the result
        System.out.println("Daily Employee Wage: $" + dailyWage);
    }
}
