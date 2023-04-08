package War;

import java.util.*;

public class Player {
	
//	c.	Player
//	i.	Fields
//	1.	hand (List of Card)
//	2.	score (set to 0 in the constructor)
//	3.	name
//	ii.	Methods
//	1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//	2.	flip (removes and returns the top card of the Hand)
//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//	4.	incrementScore (adds 1 to the Player’s score field)

	
	private String name = "";
	private ArrayList<Card> hand = new ArrayList<>();
	private int score;
	
	Player (String playerName, Deck deck){
		this.name = playerName;
		this.score = 0;
	}
	
	void draw(Deck gameDeck) {
		this.hand.add(gameDeck.draw());
	}
	
	void describe() {
		
		System.out.println(this.name + " is holding the following cards:");
		for(Card card : this.hand) {
			card.describe();
		}
	}
	
	int getHandSize() {
		return this.hand.size();
	}

	String getPlayerName() {
		return this.name;
	}
	
	Card flip() {
		Card flippedCard = this.hand.get(0);
		this.hand.remove(0);
		System.out.println(this.name + " turns over: ");
		flippedCard.describe();
		return flippedCard;
	}
	
	void incrementScore(){
		this.score++;
	}

	public int getPlayerScore() {
		return score;
	}
}
