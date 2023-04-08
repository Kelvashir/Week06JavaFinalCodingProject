package Week06;

import java.util.*;

public class App {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		2.	Create a class called App with a main method.
//		a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
//		b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//		c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//		d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
//		e)	After the loop, compare the final score from each player. 
//		f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
//
//		3.	 Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
//		a)	Using the Card describe() method when each card is flipped illustrates the game play.
//		b)	Printing the winner of each turn adds interest.  
//		c)	Printing the updated score after each turn shows game progression.
//		d)	At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.
	
		Deck newGameDeck = new Deck();
		AsteriskMaker message = new AsteriskMaker();


		
		System.out.println("WELCOME to Tyrone's card game of WAR!!!");
		System.out.println();
		message.log("Opening a new pack of cards");
		System.out.println();
		System.out.println("There are " + newGameDeck.size() + " cards in this deck.");
		System.out.println();
		newGameDeck.getCardDetails();
		System.out.println();
		message.log("Shuffling cards");
		newGameDeck.shuffleCards();
		System.out.println();
		message.log("Dealing Cards");
		newGameDeck.dealCards();
		
	}
	

}
