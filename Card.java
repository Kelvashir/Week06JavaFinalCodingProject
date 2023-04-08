package War;

public class Card {

//	a.	Card
//	i.	Fields
//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
//	ii.	Methods
//	1.	Getters and Setters
//	2.	describe (prints out information about a card)

	private String name;
	private int value;
	
	Card (String cardName, Integer cardValue) {
		this.name = cardName;
		this.value = cardValue;
	}

	String getCardName() {
		return name;
	}

	void setCardName(String cardName) {
		this.name = cardName;
	}
	
	int getCardValue() {
		return value;
	}

	void setCardValue(int cardValue) {
		this.value = cardValue;
	}
	
	void describe() {
		System.out.println("The " + this.name +" with a strength of " + this.value + ".");
	}
}
