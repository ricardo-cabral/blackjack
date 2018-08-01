package eu.ricardocabral.blackjack;

public class Card {
	private Suit suit;
	private CardRank cardRank;
	private boolean isFaceUp;

	public Card(Suit suit, CardRank cardRank) {
		this.suit = suit;
		this.cardRank = cardRank;
		isFaceUp = true;
	}

	public int getRank() {
		return cardRank.rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void flipCard() {
		isFaceUp = !isFaceUp;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public String toString() {
		if (isFaceUp) {
			return cardRank.name() + " of " + suit.name();
		} else {
			return "Face Down";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardRank == null) ? 0 : cardRank.hashCode());
		result = prime * result + (isFaceUp ? 1231 : 1237);
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardRank != other.cardRank)
			return false;
		if (isFaceUp != other.isFaceUp)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

}
