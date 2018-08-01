package eu.ricardocabral.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class Hand 
{
    private List<Card> cards;
    
    
    public Hand() {
    	cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c) {
    	if(c != null) {
    		cards.add(c);
    	}
    }
    
    public void clearCards() {
    	cards.clear();
    }

    
    public int getHandSize() {
    	return cards.size();
    }

    
    public Card getCard(int pos) {
    	if(pos >= 0 && pos < cards.size()) {
    		return cards.get(pos);
    	}else {
    		return null;
    	}
    }
    
    public int getBlackJackValue() {
        int val = 0;
        boolean ace = false;
        for(int i = 0; i < cards.size(); i++) {
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
    
    public boolean give(Card card, Hand otherHand) {
    	if(!cards.contains(card)) {
    		return false;
    	}else {
    		cards.remove(card);
    		otherHand.addCard(card);
    		return true;
    	}
    	
    }
    
    public void flipCards() {
    	for(Card card : cards) {
    		card.flipCard();
    	}
    }

    
    public List<Card> getCards(){
    	return cards;
    }
    
    public String showHand() {
    	boolean allfaceUp = true;
    	String str ="";
    	for(Card c : cards) {
    		str += c.toString()+ "\n";
    		if(!c.isFaceUp()) {
    			allfaceUp =false;
    		}
    	}
    	
    	if(allfaceUp) {
    		str += " Total points = " + getBlackJackValue();
    	}
    	return str;
    }
}
