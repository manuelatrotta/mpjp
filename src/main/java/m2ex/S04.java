package m2ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		
		int sum = 0;
		
		for (int i = first; i <= last; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {

		int sum = 0;
		
		if(first % 2 == 1) {
			first++;
		}

		for (int i = first; i <= last; i+=2) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Square root using Newton method
	 * Epsilon should be set to 0.001
	 *  
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
	    //Newton's method
		value = Math.abs(value);
		if (value == 0)
			return 0;
		double oldRoot = value;
		double newRoot = (oldRoot / 2 + value / (oldRoot * 2));

		while (((oldRoot - newRoot) > 0.001)) {

			oldRoot = newRoot;
			newRoot = 0.5 * (oldRoot + value / oldRoot);
		}
		return newRoot;
	}

	/**
     * Square root using Newton method
     * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
    public static double sqrt(double value, double epsilon) {
    	value = Math.abs(value);
		if (value == 0)
			return 0;
		double oldRoot = value;
		double newRoot = 0.5 * (oldRoot + value / oldRoot);

		while (((oldRoot - newRoot) > epsilon)) {

			oldRoot = newRoot;
			newRoot = 0.5 * (oldRoot + value / oldRoot);

		}

		return newRoot;
	}

	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if(value < 0) {
			
			return 0;
		} else if(value <= 1) {
			
			return 1;
		}
		return value * factorial(value - 1);
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		
		//a sequence of integers where each number is the sum of the previous two, except the first two 
		if (value == 0) {
			return 0;
			
		}else if (value == 1) {
			return 1;
			
		}else {
		long f1 = fibonacci(value -1);
		long f2 = fibonacci(value -2);
		long result = f1 + f2;
		return result;
		}
	}


	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {


		int[][] result = new int[value][value];
		
		for (int i = 1; i <= result.length; i++) {
			for (int j = 1; j <= result.length; j++) {
				result[i-1][j-1] = i * j;
			}
		}
		return result;
	}
}
