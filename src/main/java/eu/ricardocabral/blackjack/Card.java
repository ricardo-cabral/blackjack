package eu.ricardocabral.blackjack;

public class Card {
	private Suit suit;
	private CardRank cardRank;
	private boolean isFaceUp;
	
	public Card(Suit suit, CardRank cardRank) {
		this.suit = suit;
		this.cardRank = cardRank;
		isFaceUp = false;
	}

	public int getRank() {
		return cardRank.rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public String toString() {
		if(isFaceUp) {
		return cardRank.name() + " of " + suit.name();
		} else {
			return "Face Down";
		}
	}
	
}
