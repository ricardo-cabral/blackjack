package eu.ricardocabral.blackjack;

import java.util.Vector;

/**
 * Hello world!
 *
 */
public class Hand 
{
    private Vector<Card> hand;
    
    
    public Hand() {
    	hand = new Vector<Card>();
    }
    
    public void addCard(Card c) {
    	if(c != null) {
    		hand.addElement(c);
    	}
    }
    
    public void clearCards() {
    	hand.clear();
    }
    
    public void showHand() {
    	for (Card card : hand) {
			System.out.println(card);
		}
    }
    
    public int getHandSize() {
    	return hand.size();
    }

    
    public Card getCard(int pos) {
    	if(pos >= 0 && pos < hand.size()) {
    		return hand.elementAt(pos);
    	}else {
    		return null;
    	}
    }
    
    public int getBlackJackValue() {
        int val = 0;
        boolean ace = false;
        for(int i = 0; i < hand.size(); i++) {
            Card card;
            card = getCard(i);
            val += card.getRank();
            if(card.getRank() == CardRank.ACE.rank) {
                ace = true;
            }
        }
        if(ace == true && val + 10 <= 21) {
            val += 10;
        }
        return val;
    }
}
