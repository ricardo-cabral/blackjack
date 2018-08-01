package eu.ricardocabral.blackjack;

import java.util.Collections;

public class Deck {

	private Hand hand = new Hand();
	
	public Deck() {
		for(Suit suit : Suit.values()) {
			for(CardRank value : CardRank.values()) {
				hand.addCard(new Card(suit, value));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(hand.getCards());
	}
	
	public int getCardsLeft() {
		return hand.getHandSize();
	}

	
	public Card getCard(int i) {
		return hand.getCards().get(i);
	}
	
	public Card remove(int i) {
		return hand.getCards().remove(i);
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
	
	public void deal(Hand h, int perHand) {
		for (int i =0; i < perHand; i++) {
			this.getHand().give(hand.getCards().get(0), h);
		}
	}
	
	public void flipCard(Card card) {
		card.flipCard();
	}
}
