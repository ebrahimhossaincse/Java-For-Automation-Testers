package me.hossain.ebrahim;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		// Initializing two integer variables, 'a' and 'b'
		int a = 10;
		int b = 5;

		// Performing arithmetic operations

		int sum = a + b;         // Addition: Adds 'a' and 'b' (10 + 5) to get 15
		int difference = a - b;  // Subtraction: Subtracts 'b' from 'a' (10 - 5) to get 5
		int product = a * b;     // Multiplication: Multiplies 'a' by 'b' (10 * 5) to get 50
		int quotient = a / b;    // Division: Divides 'a' by 'b' (10 / 5) to get 2
		int remainder = a % b;   // Modulus: Finds the remainder when 'a' is divided by 'b' (10 % 5) to get 0

		// Displaying the results of each operation
		System.out.println("Sum: " + sum);           
		System.out.println("Difference: " + difference); 
		System.out.println("Product: " + product);   
		System.out.println("Quotient: " + quotient); 
		System.out.println("Remainder: " + remainder); 

	}

}
