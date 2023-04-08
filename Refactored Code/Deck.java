package War;

import java.util.*;

public class Deck {
	
	private String [] cardSuitArray = {"Clubs","Diamonds","Hearts","Spades"};
	private String [] cardNameArray = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
	private ArrayList<Card> cards = new ArrayList<>();

	Deck (){
		for(String suit : cardSuitArray) {
			int cardValue = 2;
			for(String name : cardNameArray) {
				Card card = new Card(name + " of " + suit, cardValue);
				this.cards.add(card);
				cardValue++;
			}
		}
	}
	
	void shuffle(){
		Collections.shuffle(this.cards);
	}
	
	void getCardDetails() {
		for(Card card : this.cards) {
			card.describe();
		}
	}
	
	int getDeckSize() {
		return this.cards.size();
	}
	
	Card draw() {
		Card drawnCard = this.cards.get(0);
		this.cards.remove(0);
		return drawnCard;
	}
}
