package scaredycat;

public class Hand extends CardHandler {
	private int[] cards;

	public Hand() {
		reset();
	}

	public void addCard(String card) {
		int cardIndex = this.getCardIndex(card);
		cards[cardIndex] += 1;
	}

	public String[] getCards() {
		String cardsString = "";
		for (int i = 0; i < cards.length; i++) {
			for (int b = 0; b < cards[i]; b++) {
				cardsString = cardsString + this.cardNames[i] + ",";
			}
		}
		cardsString = cardsString.substring(0, cardsString.length() - 1);
		return cardsString.split(",");
	}

	public byte getPoints() {
		byte sum = 0;
		for (int i = 1; i < cards.length; i++) {
			sum += (byte) (i * cards[i]);
		}
		return sum;
	}

	public void reset() {
		cards = new int[7];
		cards[0] = 0;
		cards[1] = 0;
		cards[2] = 0;
		cards[3] = 0;
		cards[4] = 0;
		cards[5] = 0;
		cards[6] = 0;
	}
}
