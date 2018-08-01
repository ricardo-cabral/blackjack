package eu.ricardocabral.blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*	Card c1 = new Card(Suit.HEARTS, CardRank.ACE);
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
		d1.getHand().showHand();*/
		
		Hand h1, h2, h3, dealer;
		h1 = new Hand();
		h2 = new Hand();
		h3 = new Hand();
		dealer = new Hand();
		
		Hand[] hands = {h1, h2, h3};
		Deck d1 = new Deck();
		d1.shuffle();
		d1.deal(hands, 2);
		
		d1.deal(dealer,  2);
		
		for(int i=0; i< hands.length; i++) {
			//hands[i].flipCards();
			System.out.println(hands[i].showHand());
		}
		
		dealer.getCards().get(0).flipCard();;
		
		
		System.out.println("Dealer cards: " + dealer.showHand());
	}
}
