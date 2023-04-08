package Week06;

public class Card {
	

//	a.	Card
//	i.	Fields
//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
//	ii.	Methods
//	1.	Getters and Setters
//	2.	describe (prints out information about a card)


		//Fields
	private String cardName;
	private int cardValue;
	
	
	//Constructors
	Card (String cardName, Integer cardValue) {
		this.cardName = cardName;
		this.cardValue = cardValue;
	}

	//Getters and Setters
	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	
	//Public Methods
	public void description() {
		System.out.println("The " + cardName +" has a strength of " + cardValue + ".");
	}

}
