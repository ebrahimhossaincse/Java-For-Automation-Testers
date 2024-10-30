package me.hossain.ebrahim;

public class SwichStatement {

	public static void main(String[] args) {
		
		// Declaring a variable 'day' to represent a day of the week as an integer
		int day = 3;

		// Using a switch statement to output the name of the day based on its value
		switch (day) {
		    case 1:
		        System.out.println("Monday");  // Executes if day == 1
		        break;
		    case 2:
		        System.out.println("Tuesday"); // Executes if day == 2
		        break;
		    case 3:
		        System.out.println("Wednesday"); // Executes if day == 3
		        break;
		    default:
		        System.out.println("Invalid day"); // Executes if day does not match any case
		}
	}
}
