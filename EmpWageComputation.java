import java.util.Scanner;

class EmployeeWageComputation {

    public static void main(String[] args) {
    	
    	
    	        final int DAILY_HOURS = 8; // Hours worked per day
    	        final int WORKING_DAYS_PER_MONTH = 20; // Working days per month

    	        // Create a Scanner object for user input
    	        Scanner scanner = new Scanner(System.in);

    	        // Get the scenario from user
    	        System.out.println("Select part-time scenario (1, 2, or 3):");
    	        System.out.println("1: Scenario 1 - $15 per hour");
    	        System.out.println("2: Scenario 2 - $20 per hour");
    	        System.out.println("3: Scenario 3 - $25 per hour");
    	        int scenario = scanner.nextInt();

    	        // Initialize hourly wage
    	        double hourlyWage = 0.0;

    	        // Determine hourly wage based on scenario
    	        switch (scenario) {
    	            case 1:
    	                hourlyWage = 15.0;
    	                break;
    	            case 2:
    	                hourlyWage = 20.0;
    	                break;
    	            case 3:
    	                hourlyWage = 25.0;
    	                break;
    	            default:
    	                System.out.println("Invalid scenario selected.");
    	                scanner.close();
    	                return;
    	        }

    	        // Calculate daily wage
    	        double dailyWage = hourlyWage * DAILY_HOURS;

    	        // Calculate monthly wage
    	        double monthlyWage = dailyWage * WORKING_DAYS_PER_MONTH;

    	        // Output the results
    	        System.out.println("Daily Wage for part-time employee: $" + dailyWage);
    	        System.out.println("Monthly Wage for part-time employee: $" + monthlyWage);

    	        // Close the scanner
    	        scanner.close();
    	    }
    	}

    }
}
