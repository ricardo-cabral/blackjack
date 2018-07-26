package eu.ricardocabral.blackjack;

public enum Suit {

	CLUBS('C'), SPADES('S'), DIAMONDS('D'), HEARTS('H');

	private final char suit;

	private Suit(char suit) {
		this.suit = suit;
	}
	
	public char getSuit() {
		return suit;
	}
}
