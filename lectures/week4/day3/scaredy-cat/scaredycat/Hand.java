package scaredycat;

public class Hand extends CardHandler {
	private int[] cards;

	public Hand() {
		reset();
	}

	public void addCard(String card) {
		// Adds the card to our hand
		int cardIndex = this.getCardIndex(card);
		cards[cardIndex] += 1;
	}

	public String[] getCards() {
		// We start by building a string with each card in our array written out
		// with a comma after it.
		String cardsString = "";
		for (int i = 0; i < cards.length; i++) {
			for (int b = 0; b < cards[i]; b++) {
				cardsString = cardsString + this.cardNames[i] + ",";
			}
		}
		// Remove the trailing comma from our string
		cardsString = cardsString.substring(0, cardsString.length() - 1);
		// Return the string as an Array of Strings by splitting the original string
		// by comma
		return cardsString.split(",");
	}

	public byte getPoints() {
		// Since the number of points a card returns is the same as it's index
		// i.e. 2 Birds card is stored in index 2. We can calculate the points 
		// by multiplying the index by the number of cards it contains.
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
