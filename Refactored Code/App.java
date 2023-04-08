package War;

public class App {

	public static void main(String[] args) {
	
		Deck newGameDeck = new Deck();
		MessageMaker message = new MessageMaker();
		Player player1 = new Player("Batman");
		Player player2 = new Player("Superman");
		
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
//		newGameDeck.getCardDetails();
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

		player1.describe();
		System.out.println();
		
		System.out.println("**************");
		System.out.println();
		
		player2.describe();
		System.out.println();
		
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