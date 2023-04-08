package Week06;

import java.util.*;

public class Deck {

//	b.	Deck
//	i.	Fields
//	1.	cards (List of Card)
//	ii.	Methods
//	1.	shuffle (randomizes the order of the cards)
//	2.	draw (removes and returns the top card of the Cards field)
//	3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

	Scanner sc = new Scanner(System.in);
	
	public static int pickRandomCard(int min, int max) {
		   
	    // Generate random int value from min to max
	    return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	private String [] cardSuitArray = {"Clubs","Diamonds","Hearts","Spades"};
	private String [] cardNameArray = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private int [] cardValueArray = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	private LinkedHashMap<String, Integer> newBoxOfCards = new LinkedHashMap<>();
	private Set<String> cardNames = newBoxOfCards.keySet();
	
	private ArrayList<Card> gameDeck = new ArrayList<>();
	private ArrayList<ArrayList<Card>> playerDecks = new ArrayList<>();
	
	Deck (){
		buildDeck(cardSuitArray, cardNameArray, cardValueArray);
		for(String cardName : cardNames ) {
			gameDeck.add(new Card(cardName, newBoxOfCards.get(cardName)));
		}
	}
	
	ArrayList<ArrayList<Card>> dealCards(){
		System.out.println(gameDeck.size());
		ArrayList<Card> forPlayer1 = new ArrayList<>();
		ArrayList<Card> forPlayer2 = new ArrayList<>();
		while(gameDeck.size() != 0) {
			if(forPlayer2.size() < forPlayer1.size()) {
				forPlayer2.add(drawCard());
				System.out.println("Player 2's deck is now size: " + forPlayer2.size());
			} else {
				forPlayer1.add(drawCard());
				System.out.println("Player 1's deck is now size: " + forPlayer1.size());
			}
		}
		System.out.println(gameDeck.size());
		playerDecks.add(forPlayer1);
		playerDecks.add(forPlayer2);
		return playerDecks;
	}

	LinkedHashMap<String, Integer> buildDeck(String [] suitArray, String[] nameArray, int[] valueArray){

		for(String suit : suitArray) {
			for(int i = 0; i < nameArray.length; i++) {
				newBoxOfCards.put(nameArray[i] + " of " + suit, valueArray[i]);
			}
		}
		return newBoxOfCards;
	}
	
	ArrayList<Card> shuffleCards(){
		ArrayList<Card> shuffledDeckOfCards = new ArrayList<>();
		int cardsLeftToShuffle = gameDeck.size();
		Card pickedCard = gameDeck.get(pickRandomCard(0,gameDeck.size()-1));
		
		while(cardsLeftToShuffle > 1) {
			if(!shuffledDeckOfCards.contains(pickedCard)) {
				shuffledDeckOfCards.add(pickedCard);
				cardsLeftToShuffle--;
				gameDeck.remove(pickedCard);
				pickedCard = gameDeck.get(pickRandomCard(0,gameDeck.size()-1));
			} else {
				pickedCard = gameDeck.get(pickRandomCard(0,gameDeck.size()-1));
			}	
		}
	shuffledDeckOfCards.add(gameDeck.get(0));
	gameDeck.remove(0);
	gameDeck = shuffledDeckOfCards;
	return gameDeck;
	}
	
	void getCardDetails() {
		for(Card card : gameDeck) {
			card.description();
		}
	}
	
	void readSpecificCard(int cardNumber) {
		gameDeck.get(cardNumber).description();
	}
	
	void pullCardFromDeck(int cardNumber) {
		gameDeck.remove(cardNumber);
	}
	
	int size() {
		return gameDeck.size();
	}
	
	Card drawCard() {
		Card drawnCard = gameDeck.get(0);
		gameDeck.remove(0);
		return drawnCard;
	}
}
