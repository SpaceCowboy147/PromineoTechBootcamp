package week1coding;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double itemprice = 24.95;
System.out.println(itemprice + " for a video game");

double cashinwallet = 100;
System.out.println("$" + cashinwallet + "in wallet");
cashinwallet = (double) (cashinwallet - 24.95);
System.out.println(cashinwallet +" left in wallet after purchase");

int numberoffriends = 5;
System.out.println("I have" + numberoffriends + "friends");

double age = 23;
System.out.println("Dylan's age:" + age);
age = age/5;
System.out.println("Every " + age + " years I made 1 friend");

String firstname = "Dylan";
System.out.println(firstname);

String lastname = "Harper";
System.out.println(lastname);

char middleinitial = 'K';
System.out.println(middleinitial);
String fullname = firstname + middleinitial + lastname; 
System.out.println("My name is: "+ fullname);

	}

}
