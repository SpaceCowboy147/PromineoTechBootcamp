package week2coding;

public class coding2assingment {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		System.out.println(isHotOutside);
		System.out.println(isWeekday);
		System.out.println(hasMoneyInPocket);
		
		
		double costOfMilk = 2.50;
		double moneyInWallet = 12.50;
		int thirstLevel = 8;
		System.out.println(costOfMilk);
		System.out.println(moneyInWallet);
		System.out.println(thirstLevel);
		
		if (isHotOutside && hasMoneyInPocket) {
		System.out.println("You should buy ice cream!");
		} else if (isHotOutside || hasMoneyInPocket)
			System.out.println("Don't buy ice cream.");
		
	
		
if (isHotOutside && !isWeekday) {
		System.out.println("Will go swimming");
} else if (isHotOutside || isWeekday)
	System.out.println("Will not go swimming");
		
		if (isHotOutside && hasMoneyInPocket && !isWeekday) {
		System.out.println("It's a great day! :)" );
		} else if (isHotOutside && hasMoneyInPocket && !isWeekday)
			System.out.println("It's not a great day );");
		
		if (isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk * 2) { 
		System.out.println("Will buy milk");
		} else if (isHotOutside || thirstLevel >= 3 || moneyInWallet >= costOfMilk * 2) {
			System.out.println("Don't buy the milk!");
		
				
	}
		
	
	}
}


