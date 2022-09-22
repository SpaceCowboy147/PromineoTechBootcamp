package wargame;



public class War {

	public static void main(String[] args) {
		Cards[][] hands = new Cards[2][1];
	    deckOfCards myDeck = new deckOfCards();

	    
	    for (int i = 0; i < 26; i++) { //2 cards are dealt each game so half the deck - 26.
	    	  System.out.printf("\n Round %s of The War \n", i);

	    	 
	            for (int player = 0; player < hands.length; player++)
	                hands[player][0] = myDeck.dealCard();

	        for (int player = 1; player < hands.length; player++) {
	            System.out.printf("Player %d: ", player);
	            printHand(hands[player]);
	            
	        }
	        
	        //get the value from the Card object
	        int player1 = hands[0][0].getValue();
        int player2 = hands[1][0].getValue();

	        

	        if (player1 > player2)
	            System.out.println("Player One Wins The War");
	        else if (player2 > player1)
	            System.out.println("Player Two Wins The War");
	        else
	            System.out.println("The War Is A Tie"); 
  }
	    }
	
	

  public static void printHand(Cards[] hand) {

      for (int card = 0; card < hand.length; card++)
          System.out.printf("%s", hand[card].toString());

      System.out.println();


}
  {

}
}