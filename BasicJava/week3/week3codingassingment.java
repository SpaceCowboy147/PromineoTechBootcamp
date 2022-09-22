package week3Codingassingment;

import java.util.Arrays;

public class week3codingassingment {

	public static void main(String[] args) {
		 
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int[] age = {3, 9, 23, 64, 2, 8, 28, 93}; {
		    int firstNum = age[0];
			int lastNum = age[age.length - 1];
			System.out.println(lastNum - firstNum); }
		
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		double[] age1 = {54, 3, 9, 23, 64, 2, 8, 28, 93, 108}; {
		    double firstNum = age1[0];
			double lastNum = age1[age1.length - 1];
			System.out.println(lastNum - firstNum); }
		
		
		//	c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

	double sum = 0;
	double avg = 0;
	for (int i = 0; i < age1.length; i++) {
		sum = sum + age1[i]; }
		avg = sum/age1.length;
		System.out.println("Average is " + avg);
		
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] name = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		  int sumOfAllLetters = 0;
			for (String names : name) {
			sumOfAllLetters += names.length();
			} System.out.println(sumOfAllLetters);
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		//	for (int i = 0; i < name.length; i++) {
			System.out.println(Arrays.toString(name));
			
	
				
		
				//		3.	How do you access the last element of any array? 
				  int lastNum = age[age.length-1];
				  System.out.println(lastNum);
				
//		4.	How do you access the first element of any array? 
				int firstNum = age[0];
				System.out.println(firstNum); 
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
				int[] nameLengths = new int[name.length];
				for(int i = 0; i < name.length; i++) {
				     nameLengths[i] = name[i].length(); } 
				System.out.println(Arrays.toString(nameLengths));
						
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

			int sumOfLetter = 0;
			for (String names : name) {
		
			 sumOfLetter += names.length();
			
			} System.out.println(sumOfLetter);

//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
			System.out.println(repeat("Hello" , 3));
		  
//		   
//      8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
String firstName = "Dylan";
String lastName = "Harper";
String fullName = createFullName(firstName, lastName); 
System.out.println(fullName);
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
 int[] number = {5, 24, 13, 32, 42, 16};

 
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	     double[] cost = {6.25, 4.50, 10.99, 7.25};
	     System.out.println(average(cost));
	}
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
         double[] a = {5, 10, 15, 20,};
         double[] b = {1, 2, 3, 4, 5,};
  //       System.out.println(sum(a));
   
	     //		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
boolean isHotOutside = true;
double moneyInPocket = 10.50; {
if (isHotOutside && moneyInPocket >= 10.50); 
 System.out.println("Buy milk"); 
} else { 
	System.out.println("No milk");
}


         //		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

		   
			
	//7
	public static String repeat(String str, int n) {
       String result = "";
       for (int i = 0; i < n; i++) {
       result += str;
    }
	return result; }

	//8
public static String createFullName(String firstName, String lastName) {
 String fullName = firstName + " " + lastName;
 return fullName;
}	
//9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//public static boolean greaterThan100(boolean[] array) {
//	if (i = 0, i  < 100, i==);

//10.) 
public static double average(double[] array) {
	double sum = 0;
			for (double number : array) {
				sum += number; 
			}
			return sum / array.length;
			}
//11.)

public static double a(double[] array) {
	double sum = 0;
	for (double number : array) {
		sum += number; 
	}
	return sum / array.length;
	}


   }


		

