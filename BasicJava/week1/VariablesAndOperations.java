package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int planeSeatsLeft = 25;
		//create a variable to hold the cost of groceries at checkout
		double groceriesCost = 105.72;
		//create a variable to hold a person's middle initial
		char middleInitial = 'K';
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean itsHotOutside = true;
		//create a variable to hold a customer's first name
		String firstName = "Dylan";
		//create a variable to hold a street address
		String streetaddress = "5454 west Drury Lane"; 
		//print all variables to the console
		System.out.println("Number of plane seats left " + planeSeatsLeft);
		System.out.println("The total cost of groceries is " + groceriesCost);
		System.out.println("Middle initital: " + middleInitial);
		System.out.println("It is hot outside:" + itsHotOutside);
		System.out.println("The customer's first name is " + firstName);
		System.out.println("The customer's street address is" + streetaddress);
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
	planeSeatsLeft = planeSeatsLeft - 2;
	System.out.println(planeSeatsLeft + " plane seats are left after booking two");
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceriesCost += 2.15;
		System.out.println("The total cost of groceries after candy bar is " + groceriesCost);
		
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		char middleInitia1 = 'D';
		System.out.println("The middle initial was switched to " + middleInitia1);
		//the season has changed, update the hot outside variable to be opposite of what it was
		itsHotOutside = !itsHotOutside;
				System.out.println("It is hot outside: " + itsHotOutside);
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullname = firstName +" " + middleInitial + " Harper";
		System.out.println(fullname);
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hello, my name is " + fullname + " and I live at " + streetaddress);

	}

}
