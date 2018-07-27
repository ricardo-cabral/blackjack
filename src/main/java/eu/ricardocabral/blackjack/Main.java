package eu.ricardocabral.blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Card c1 = new Card(Suit.HEARTS, CardRank.ACE);
		Card c2 = new Card(Suit.SPADES, CardRank.JACK);
		
		c1.flipCard();
		c2.flipCard();
		
		Hand h1 = new Hand();
		h1.addCard(c1);
		h1.addCard(c2);
		h1.showHand();
		
		Hand h2 = new Hand();
		h1.give(c1, h2);
		h1.clearCards();
		System.out.println("HAND 1");h1.showHand();
		System.out.println("HAND 2");h2.showHand();
		
		Deck d1 = new Deck();
		d1.shuffle();
		d1.getHand().showHand();
	}
}
