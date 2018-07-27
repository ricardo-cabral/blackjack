package eu.ricardocabral.blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

	Hand hand = new Hand();
	private List<Card> deck = new LinkedList<>();
	
	public Deck() {
		for(Suit suit : Suit.values()) {
			for(CardRank value : CardRank.values()) {
				deck.add(new Card(suit, value));
				hand.addCard(new Card(suit, value));
			}
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(deck);
		Collections.shuffle(hand.getCards());
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
	
	public Hand getHand() {
		return hand;
	}
	
	public void deal(Hand[] hands, int perHand) {
		for(int i =0; i < perHand; i++) {
			for(int j =0; j < hands.length; j++) {
				this.getHand().give(hand.getCards().get(0), hands[j]);
			}
		}
	}
	
	public void deal(Hand hand, int perHand) {
		for (int i =0; i < perHand; i++) {
			this.getHand().give(hand.getCards().get(0), hand);
		}
	}
	
	public void flipCard(Card card) {
		card.flipCard();
	}
}
