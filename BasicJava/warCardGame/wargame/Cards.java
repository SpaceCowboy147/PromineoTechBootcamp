package wargame;

public class Cards {
	 private int cardNum;
	    final static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    final static String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

	    Cards (int theCard) {
	        setCardNum (theCard);
	    }

//	    ternary operator consists of three segments. The first is a conditional expression that returns a boolean value. 
//	    The second and third are the values before and after the colon.
	    //It returns the value before the colon if the conditional expression is true. otherwise, it returns the value after.
	    public void setCardNum (int theCard) {
	        cardNum = (theCard >= 0 && theCard <= 51)? theCard: 0;
	    }

	    public int getCardNum() {
	        return cardNum;
	    }

	    
	    
	    public String toString() { 
	        return ranks[cardNum%13] + " of " + suits[cardNum/13];
	    }

	    public String getSuit() {
	        return suits[cardNum/13];
	    }

	    public String getRank() {
	        return ranks[cardNum%13];
	    }

	    public int getValue() {
	        return cardNum%13;
	    } 
	}


