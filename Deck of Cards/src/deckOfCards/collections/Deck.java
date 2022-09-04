package deckOfCards.collections;

import java.util.Random;

public class Deck {

	private Card[] cardsArray;
	
	public Deck(int n) {
		this.cardsArray = new Card[n];
	}

	public Deck() {
		this.cardsArray = new Card[52];
		int index = 0;
		for (int suit = 1; suit <= 4; suit++)
			for (int rank = 1; rank <= 13; rank++) {
				this.cardsArray[index] = new Card(suit, rank);
				index++;
			}
	}
	
	public void printDeck() {
		for (int index = 0; index < 52; index++)
			System.out.println(this.cardsArray[index]);
	}
	
	public void shuffleDeck() {
		for (int index = 0; index < this.cardsArray.length-1; index++) {
			int replaceWith = this.randomInt(index, this.cardsArray.length - 1);
			this.swap(index, replaceWith);
		}		
	}
	
	public void swap(int toSwap, int replaceWith) {
		Card intermediate = this.cardsArray[toSwap];
		this.cardsArray[toSwap] = this.cardsArray[replaceWith];
		this.cardsArray[replaceWith] = intermediate;
	}
	
	public int randomInt(int start, int end) {
		Random random = new Random();
        int range = end - start + 1;
        return start + random.nextInt(range);
    }
	
	public void deal(int numberOfPlayers, int numberOfCards, String [][]playerHand) {
		int index = 0;
		for (int card = 1; card <= numberOfCards; card++)
			for (int player = 0; player < numberOfPlayers; player++)
			{
				playerHand[card][player] = cardsArray[index].toString();
				index++;
			}
	}	
}
