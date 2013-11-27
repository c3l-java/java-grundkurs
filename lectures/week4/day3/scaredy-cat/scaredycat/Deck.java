package scaredycat;

public class Deck extends CardHandler{
	private int[] cards;
	private int cardCount;

	public Deck(){	
		// Cards is an array where each index is the number of cards 
		// of a specific type. 
		// 	i.e cards[0] = 3; 
		// 	index 0 is where we save cat cards so this sets there 
		// 	to be 3 cats in our deck
		cards = new int[8];
		cards[0] = 3; // Cats
		cards[1] = 7; // 1 Bird
		cards[2] = 7; // 2 Birds
		cards[3] = 7; // 3 Birds
		cards[4] = 7; // 4 Birds
		cards[5] = 6; // 5 Birds
		cards[6] = 6; // 6 Birds
		cards[7] = 6; // Scarecrow
		cardCount = 49;
	}
		
	public String getCard(){
		// We need to get a weighted random number based on the type and number of cards
		// left in the pack
		int randomIndex = (int)Math.floor(Math.random() * cardCount); // 0-48
		int cardIndex = -1;
		int sum = 0;
		for(int i = 0; i < cards.length; i++){
			if(randomIndex >= sum && randomIndex < (cards[i] + sum) ){
				cardCount--;
				cards[i]--;
				cardIndex = i;
				break;
			}
			sum += cards[i];
		}
		return cardNames[cardIndex];		
	}
	
	public void addCards(String[] cards){
		for(int i = 0; i < cards.length; i++ ){
			int currentIndex = getCardIndex(cards[i]);
			this.cards[currentIndex] += 1;
			cardCount++;
		}
	}
}
