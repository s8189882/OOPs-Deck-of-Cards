package deckOfCards.collections;

/*Write a Program DeckOfCards.java, to initialize deck of cards 
having suit ("Clubs", "Diamonds", "Hearts", "Spades") 
& Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
Shuffle the cards using Random method and then distribute 9 Cards to 4 Players 
and Print the Cards received by the 4 Players using 2D Array...*/

public class DeckOfCards {
	
	private static final int NUMBER_OF_PLAYERS = 4;
	private static final int NUMBER_OF_CARDS = 9;
	
	public static void main(String[] args) {
		Deck deckOperations = new Deck();
		System.out.println("Displaying Deck : ");
		deckOperations.printDeck();
		deckOperations.shuffleDeck();
		System.out.println("\nShuffled deck : ");
		deckOperations.printDeck();
		
		String[][] playerHands = new String[10][4];
		Player playerOperations = new Player();
		playerOperations.getPlayers(playerHands);
		deckOperations.deal(NUMBER_OF_PLAYERS, NUMBER_OF_CARDS, playerHands);
		System.out.println("\nDisplaying Player hands after distributing cards : \n");
		playerOperations.print(playerHands);
	}
}
