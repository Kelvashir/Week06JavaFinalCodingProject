package War;

public class App {

	public static void main(String[] args) {

		
//		2.	Create a class called App with a main method.
//		a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
//		b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other
//			player each iteration using the Deck you instantiated.
//		c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//		d)	Compare the value of each card returned by the two player’s flip methods. Call the 
//			incrementScore method on the player whose card has the higher value.
//		e)	After the loop, compare the final score from each player. 
//		f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” 
//			depending on which score is higher or if they are both the same.
//
//		3.	 Tips:  Printing out information throughout the game adds value including easier 
//			debugging as you progress and a better user experience.
//		a)	Using the Card describe() method when each card is flipped illustrates the game play.
//		b)	Printing the winner of each turn adds interest.  
//		c)	Printing the updated score after each turn shows game progression.
//		d)	At the end of the game: print the final score of each player and the winner’s name 
//			or “Draw” if the result is a tie.
	
		Deck newGameDeck = new Deck();
		MessageMaker message = new MessageMaker();
		Player player1 = new Player("Batman", newGameDeck);
		Player player2 = new Player("Superman", newGameDeck);
		
		message.log("WELCOME to Tyrone's card game WAR!!!");
		System.out.println();
		
		message.log("Opening a new pack of cards");
		System.out.println();
		
//		System.out.println("There are " + newGameDeck.getDeckSize() + " cards in this deck.");
//		System.out.println();
//		
//		newGameDeck.getCardDetails();
//		System.out.println();
		
		message.log("Shuffling cards");
		newGameDeck.shuffle();
		//newGameDeck.getCardDetails();
		System.out.println();
		
		message.log(player1.getPlayerName() + " is player 1" + " and " + player2.getPlayerName() + " is player 2!");
		System.out.println();
		
		message.log(player1.getPlayerName() + " and " + player2.getPlayerName() + " are drawing their cards");
		
		for(int i = 52; i > 0; i--) {
			if(player2.getHandSize() < player1.getHandSize()) {
				player2.draw(newGameDeck);				
			} else {
			player1.draw(newGameDeck);
			}
		}
		System.out.println();

//		player1.describe();
//		System.out.println();
//		
//		System.out.println("**************");
//		System.out.println();
//		
//		player2.describe();
//		System.out.println();
		
		message.log("The players are ready - let the battle begin!");
		System.out.println();
		
		for(int i = 26; i > 0; i--) {
			int player1Strength = player1.flip().getCardValue();
			int player2Strength = player2.flip().getCardValue();
			if(player1Strength > player2Strength) {
				System.out.println(player1.getPlayerName() + " wins this hand and gets 1 point!");
				System.out.println();
				player1.incrementScore();
			} else if (player1Strength < player2Strength){
				System.out.println(player2.getPlayerName() + " wins this hand and gets 1 point!");
				System.out.println();
				player2.incrementScore();
			} else {
				System.out.println("This hand is a draw and no points are awarded!");
				System.out.println();
			}
			System.out.println("The score is now " + player1.getPlayerName() + " at " + player1.getPlayerScore()
								+ " and " + player2.getPlayerName() + " at " + player2.getPlayerScore());
			System.out.println();
			
		}
		System.out.println(player1.getPlayerName() + " has a final score of " + player1.getPlayerScore());
		System.out.println(player2.getPlayerName() + " has a final score of " + player2.getPlayerScore());
		System.out.println();
		if(player1.getPlayerScore() > player2.getPlayerScore()) {
			message.log(player1.getPlayerName() + " WINS!!!");
		} else if(player1.getPlayerScore()< player2.getPlayerScore()) {
			message.log(player2.getPlayerName() + " WINS!!!");
		} else {
			message.log("It's a DRAW!!!");
		}	
	}
}