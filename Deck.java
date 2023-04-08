package War;

import java.util.*;

public class Deck {
	

//	b.	Deck
//	i.	Fields
//	1.	cards (List of Card)
//	ii.	Methods
//	1.	shuffle (randomizes the order of the cards)
//	2.	draw (removes and returns the top card of the Cards field)
//	3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

	public static int pickRandomCard(int min, int max) {
		   
	    return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	private String [] cardSuitArray = {"Clubs","Diamonds","Hearts","Spades"};
	private String [] cardNameArray = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
	private ArrayList<Card> cards = new ArrayList<>();

	Deck (){
		buildDeck(cardSuitArray, cardNameArray);
	}
	
	ArrayList<Card> buildDeck(String [] suitArray, String[] nameArray){
		for(String suit : suitArray) {
			int cardValue = 2;
			for(String name : nameArray) {
				Card card = new Card(name + " of " + suit, cardValue);
				this.cards.add(card);
				cardValue++;
			}
		}
		return this.cards;
	}
	
	ArrayList<Card> shuffle(){
		ArrayList<Card> shuffledDeckOfCards = new ArrayList<>();
		int cardsLeftToShuffle = this.cards.size();
		Card pickedCard = this.cards.get(pickRandomCard(0,this.cards.size()-1));
		
		while(cardsLeftToShuffle > 1) {
			if(!shuffledDeckOfCards.contains(pickedCard)) {
				shuffledDeckOfCards.add(pickedCard);
				cardsLeftToShuffle--;
				this.cards.remove(pickedCard);
				pickedCard = this.cards.get(pickRandomCard(0,this.cards.size()-1));
			} else {
				pickedCard = this.cards.get(pickRandomCard(0,this.cards.size()-1));
			}	
		}
	shuffledDeckOfCards.add(this.cards.get(0));
	this.cards.remove(0);
	this.cards = shuffledDeckOfCards;
	return this.cards;
	}
	
//	void getCardDetails() {
//		for(Card card : this.cards) {
//			card.describe();
//		}
//	}
//	
//	void readSpecificCard(int cardNumber) {
//		this.cards.get(cardNumber).describe();
//	}
//	
//	void pullCardFromDeck(int cardNumber) {
//		this.cards.remove(cardNumber);
//	}
	
	int getDeckSize() {
		return this.cards.size();
	}
	
	Card draw() {
		Card drawnCard = this.cards.get(0);
		this.cards.remove(0);
		return drawnCard;
	}
}
