package eu.ricardocabral.blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();

		Hand p1hand = new Hand();
		Player player = new Player();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		player.setName(sc.nextLine());

		System.out.println("Welcome " + player.getName() + "!");

		player.setHand(p1hand);

		p1hand.addCard(deck.dealCard());
		p1hand.addCard(deck.dealCard());

		System.out.println(player.getName() + ": ");
		p1hand.showHand();
		System.out.println("Score: " + p1hand.getBlackJackValue());
		System.out.println();
	}
}
