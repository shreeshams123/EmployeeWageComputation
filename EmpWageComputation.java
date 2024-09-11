import java.util.Scanner;

class EmployeeWageComputation {

    public static void main(String[] args) {
    	
    	 int dailyHours = getWorkHours();
	        System.out.println("Daily Work Hours: " + dailyHours);
	    }
    	
    	
    	    // Constants
    	    final static int FULL_DAY_HOURS = 8;
    	    final static int PART_TIME_HOURS = 4;

    	    public static int getWorkHours() {
    	        Random random = new Random();
    	        
    	        // Generate random attendance (1 for full-time, 2 for part-time, 0 for absent)
    	        int attendance = random.nextInt(3);

    	        switch (attendance) {
    	            case 1:
    	                return FULL_DAY_HOURS;  // Full-time employee
    	            case 2:
    	                return PART_TIME_HOURS; // Part-time employee
    	            default:
    	                return 0;  // Employee is absent
    	        }
    	    }

    	   
    	        // Example usage of the getWorkHours function
    	       
    	}



    
