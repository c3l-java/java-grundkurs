package scaredycat;

public class CardHandler {
	protected String[] cardNames = new String[8];
	CardHandler(){
		cardNames[0] = "Cat";
		cardNames[1] = "1 Bird";
		cardNames[2] = "2 Birds";
		cardNames[3] = "3 Birds";
		cardNames[4] = "4 Birds";
		cardNames[5] = "5 Birds";
		cardNames[6] = "6 Birds";
		cardNames[7] = "Scarecrow";
	}
	protected int getCardIndex(String card){
		for(int i = 0; i < cardNames.length; i++){
			if(cardNames[i].equals(card)){
				return i;
			}
		}
		return -1;
	}
}
