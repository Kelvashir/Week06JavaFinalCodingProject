package War;

import java.util.*;

public class Player {
	
	private String name = "";
	private ArrayList<Card> hand = new ArrayList<>();
	private int score;
	
	Player(String playerName) {
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
