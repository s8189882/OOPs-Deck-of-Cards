package deckOfCards.collections;

public class Card {
	
	private int suit;
	private int rank;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		String[] suits = {null, "Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		return (ranks[this.rank] + " of " + suits[this.suit]);
	}
	
	public int getSuit() {
		return this.suit;
	}

	public int getRank() {
		return this.rank;
	}
}
