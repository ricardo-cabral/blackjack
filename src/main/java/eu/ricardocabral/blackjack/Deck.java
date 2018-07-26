package eu.ricardocabral.blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

	private List<Card> deck = new LinkedList<>();
	
	public Deck() {
		for(Suit suit : Suit.values()) {
			for(CardRank value : CardRank.values()) {
				deck.add(new Card(suit, value));
			}
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public int getCardsLeft() {
		return deck.size();
	}
	
	public Card dealCard() {
		if(deck.size() == 52) {
			shuffle();
		}
		
		return deck.remove(0);
	}
	
	public Card getCard(int i) {
		return deck.get(i);
	}
	
	public Card remove(int i) {
		return deck.remove(i);
		
	}
	
}
