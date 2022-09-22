package week2BooleanConditionalsLoops;

public class BooleanConditionalsLoops {
	
	public static void main(String[] args) {
		
		//create a variable named age and assign it a value of 14
		int age = 14;
		//print the boolean expression age >= 16 to the console and note the results.
		//change the value of age to 18 and run again.
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise
		//change the value of age and rerun to see the result
		
		if (age >= 16) {
			System.out.println("You can drive");
	} else {
		System.out.println("You cannot drive");
	}
	
		
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		boolean hasLicense = false;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
	} else {
		System.out.println("You cannot drive");
	}
		//if you change hasLicense to !hasLicence then the result will be You can drive
		
		
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		double costOfMilk = 2.10;
		int thirstlevel =  4;
		if (costOfMilk < 2.50 || thirstlevel > 6) {
			System.out.println("Milk please");
		} else { 
			System.out.println("No Thanks");
		}
		// if cost of milk is changed to 3.50, then the result will be "No Thanks."
		//if thirst level is changed to 7, then the result will be "Milk please" because the milk is still under $2.50.
		
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohoooo!"
		//if there are 5 or more cookies, print "Jackpot!"
			int numberOfChildren = 6;
			int numberOfCookies = 25;
			if (numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad Face");
	} else if (numberOfCookies % numberOfChildren > 0) {
		System.out.println("Yes!");
	} else if (numberOfCookies % numberOfChildren >= 2) {
		System.out.println("Whoohoo");
	} else { 
		System.out.println("Jackpot");
	}
		
		
		
		
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loylatyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
	case "SILVER":
		loyaltyMemberDiscount = .1;
		break;
	case "GOLD":
		loyaltyMemberDiscount = .15;
		break;
	case "PLATINUM":
		loyaltyMemberDiscount = .25;
		break;
		}
	System.out.println(loyaltyMemberDiscount); 
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDisount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		double billTotal = 199.95;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
				
			}
		}
		System.out.println(loyaltyMemberStatus);
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//otherwise, print "access denied"
		
		String username ="Tommy123";
		String password = "12345";
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Access denied");
		}
		//write a for loop that prints each number from 0 to 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//write a for loop that prints each number from 10 to 0 backwards
		for (int i = 10; i>0; i--) {
			System.out.println(i);
		}
	
		//write a for loop that prints every other number from 0 to 100
		for (int i = 0; i <=100; i +=2) {
			System.out.println(i);
		}
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 ) {
				System.out.println("EVEN");
			} else {
				System.out.println("ODD");
			}
		}
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i--;
		}
	}
		}
	
	


