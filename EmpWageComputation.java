import java.util.Scanner;

class EmployeeWageComputation {

    public static void main(String[] args) {
    	
    	
    	
    	    final static int WAGE_PER_HOUR = 20;
    	    final static int FULL_DAY_HOURS = 8;
    	    final static int PART_TIME_HOURS = 4;
    	    final static int MAX_WORKING_DAYS = 20;
    	    final static int MAX_WORKING_HOURS = 100;

    	   
    	        // Variables
    	        int totalWorkingDays = 0;
    	        int totalWorkingHours = 0;
    	        int totalWage = 0;

    	        // HashMap to store day and daily wages
    	        HashMap<Integer, Integer> dailyWages = new HashMap<>();

    	        // Random object to simulate attendance
    	        Random random = new Random();

    	        // Loop until either maximum working days or maximum working hours is reached
    	        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
    	            totalWorkingDays++;

    	            // Get work hours for the day
    	            int dailyHours = getWorkHours();
    	            
    	            // Check if total working hours exceed the maximum allowed hours
    	            if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
    	                dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
    	            }

    	            // Add daily hours to total working hours
    	            totalWorkingHours += dailyHours;

    	            // Calculate daily wage
    	            int dailyWage = dailyHours * WAGE_PER_HOUR;
    	            totalWage += dailyWage;

    	            // Store day and daily wage in the HashMap
    	            dailyWages.put(totalWorkingDays, dailyWage);
    	        }

    	        // Output the day, daily wages, and total wage
    	        System.out.println("Day and Daily Wages: " + dailyWages);
    	        System.out.println("Total Monthly Wage: $" + totalWage);
    	    }

    	    // Function to get work hours based on attendance
    	    public static int getWorkHours() {
    	        Random random = new Random();
    	        int attendance = random.nextInt(3);  // Generate random attendance (0, 1, or 2)

    	        switch (attendance) {
    	            case 1:
    	                return FULL_DAY_HOURS;  // Full-time employee
    	            case 2:
    	                return PART_TIME_HOURS; // Part-time employee
    	            default:
    	                return 0;  // Employee is absent
    	        }
    	    }
    	}


    
