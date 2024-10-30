package me.hossain.ebrahim;

public class RelationalOperators {

	public static void main(String[] args) {
		// Initializing two integer variables, 'x' and 'y'
		int x = 8;
		int y = 12;

		// Using relational operators to compare 'x' and 'y'

		boolean isEqual = (x == y);       // Equal to: Checks if 'x' is equal to 'y' (8 == 12) => false
		boolean isNotEqual = (x != y);    // Not equal to: Checks if 'x' is not equal to 'y' (8 != 12) => true
		boolean isGreater = (x > y);      // Greater than: Checks if 'x' is greater than 'y' (8 > 12) => false
		boolean isLesser = (x < y);       // Less than: Checks if 'x' is less than 'y' (8 < 12) => true

		// Displaying the results of each comparison
		System.out.println("Is Equal: " + isEqual);  
		System.out.println("Is Not Equal: " + isNotEqual);
		System.out.println("Is Greater: " + isGreater);   
		System.out.println("Is Lesser: " + isLesser);   

	}

}
