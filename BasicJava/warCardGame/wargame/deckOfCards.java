package wargame;

import java.util.Collections;

public class deckOfCards {



	    private Cards[] deck = new Cards[52];
	    private int topCard;

	    deckOfCards() {

	        topCard = 0;

	        for (int i = 0; i < deck.length; i++)
	            deck[i] = new Cards(i);

	    }

	    public void shuffle() {
// I think i need a list to use collections to shuffle
//	    	{
//	    	    Collections.shuffle(deck);
//	    	}
	    	
	    	
	        topCard = 0;

	        for (int i = 0; i < 1000; i++) {
	            int j = (int)(Math.random()*52);
	            int k = (int)(Math.random()*52);
	            Cards tmpCard = deck[j];
	            deck[j] = deck[k];
	            deck[k] = tmpCard;
	        } 
	   }

	    public Cards dealCard() {
	        Cards theCard;
	        if (topCard < deck.length) {
	            theCard = deck[topCard];
	            topCard++;
	        }
	        else
	            theCard = null;

	        return theCard;
	    }
	}