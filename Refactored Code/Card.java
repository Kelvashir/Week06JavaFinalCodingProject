package War;

public class Card {

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
