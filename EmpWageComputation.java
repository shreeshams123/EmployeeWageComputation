import java.util.Scanner;

class EmployeeWageComputation {

    public static void main(String[] args) {
    	
    	
    	
    	        final int WAGE_PER_HOUR = 20;
    	        final int FULL_DAY_HOURS = 8;
    	        final int PART_TIME_HOURS = 4;
    	        final int MAX_WORKING_DAYS = 20;
    	        final int MAX_WORKING_HOURS = 100;

    	        // Variables
    	        int totalWorkingDays = 0;
    	        int totalWorkingHours = 0;
    	        int totalWage = 0;

    	        Random random = new Random();

    	        // Loop until either maximum working days or maximum working hours is reached
    	        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
    	            totalWorkingDays++;
    	            
    	            // Generate random attendance (1 for full-time, 2 for part-time, 0 for absent)
    	            int attendance = random.nextInt(3); 

    	            int dailyHours = 0;
    	            switch (attendance) {
    	                case 1:
    	                    dailyHours = FULL_DAY_HOURS;  // Full-time employee
    	                    break;
    	                case 2:
    	                    dailyHours = PART_TIME_HOURS;  // Part-time employee
    	                    break;
    	                default:
    	                    dailyHours = 0;  // Employee is absent
    	            }

    	            // Check if total working hours exceed the maximum allowed hours
    	            if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
    	                dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
    	            }

    	            // Add daily hours to total working hours
    	            totalWorkingHours += dailyHours;

    	            // Calculate daily wage and add to total wage
    	            int dailyWage = dailyHours * WAGE_PER_HOUR;
    	            totalWage += dailyWage;

    	            // Display the details for each day
    	            System.out.println("Day: " + totalWorkingDays + " | Hours Worked: " + dailyHours + " | Daily Wage: $" + dailyWage);
    	        }

    	        // Output the total wage, total working hours, and total working days
    	        System.out.println("\nTotal Working Days: " + totalWorkingDays);
    	        System.out.println("Total Working Hours: " + totalWorkingHours);
    	        System.out.println("Total Monthly Wage: $" + totalWage);
    	    }
    	}


    }
}
