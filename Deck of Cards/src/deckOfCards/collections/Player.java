package deckOfCards.collections;

public class Player {
	
	public void getPlayers(String[][] players) {
		for (int index = 0; index < 4; index++) {
			players[0][index] = "PLAYER "+ (index+1);
		}
	}
	
	public void print(String[][] players) {
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 4; column++) {
				System.out.print(players[row][column] + "\t\t");
			}
		System.out.println("\n");
		}
	}
}