package eu.ricardocabral.blackjack;

public enum CardRank {
	ACE(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

	public final int rank;

	CardRank(int c) {
		rank = c;
	}
}
