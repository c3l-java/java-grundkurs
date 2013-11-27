import scaredycat.*;

public class Play {
	static Hand[] hand = new Hand[2];
	static byte scarecrow = 0;
	static Deck deck = new Deck();

	public static void main(String[] args) {
		hand[0] = new Hand();
		hand[1] = new Hand();
		int turn = 0;

		// Play game
		do {
			String currentCard = deck.getCard();
			playTurn(turn % 2, currentCard);
			turn++;
		} while (scarecrow < 6);
		displayResult();
	}

	public static void playTurn(int player, String currentCard) {
		System.out.println("Player " + (player + 1) + " got a " + currentCard);
		if (currentCard.equals("Scarecrow")) {
			scarecrow++;
		} else {
			hand[player].addCard(currentCard);
		}

		if (currentCard.equals("Cat")) {
			deck.addCards(hand[player].getCards());
			hand[player].reset();
		}
	}

	public static void displayResult() {
		System.out.println();
		System.out.println("-------GameOver-------");
		// Who won?
		if (hand[0].getPoints() > hand[1].getPoints()) {
			System.out.println("Player 1 has won with " + hand[0].getPoints()
					+ " birds");
		} else if (hand[0].getPoints() == hand[1].getPoints()) {
			System.out.println("It's a draw " + hand[0].getPoints() + " birds");
		} else {
			System.out.println("Player 2 has won with " + hand[1].getPoints()
					+ " birds");
		}
	}
}
