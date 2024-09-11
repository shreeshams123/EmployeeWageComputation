
class EmpWageComputation{
	
	    public static void main(String[] args) {
	        // Create an instance of Random class
	        Random random = new Random();

	        // Simulate attendance
	        boolean isPresent = random.nextBoolean(); // Randomly returns true or false

	        // Display attendance result
	        if (isPresent) {
	            System.out.println("The employee is present.");
	        } else {
	            System.out.println("The employee is absent.");
	        }
	    }
	}

