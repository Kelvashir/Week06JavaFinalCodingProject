package Week06;

import java.util.*;

public class Player {
	
	Scanner sc = new Scanner(System.in);
	
//	c.	Player
//	i.	Fields
//	1.	hand (List of Card)
//	2.	score (set to 0 in the constructor)
//	3.	name
//	ii.	Methods
//	1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//	2.	flip (removes and returns the top card of the Hand)
//	3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//	4.	incrementScore (adds 1 to the Player’s score field)
	
	private ArrayList<Card> playerHand = new ArrayList<>();
	private int playerScore;
	private String playerName = "";
	
//	private HashMap<Integer, String> playerList = new HashMap<>();
//	private Set<Integer> playerNumber = playerList.keySet();
	
	Player (String playerName, ArrayList<Card> playerHand){
		this.playerName = playerName;
		this.playerHand = playerHand;
		this.playerScore = 0;
	}
	
//	HashMap<Integer, String> getPlayers(){
//		System.out.print("Enter the number of players: ");
//		int numberOfPlayers = sc.nextInt();
//		boolean validNumberOfPlayers = false;
//		
//		while(!validNumberOfPlayers) {
//			if (numberOfPlayers == 1) {
//				System.out.println("This game requires at least two people to play. \nEnter the number of players: ");
//				numberOfPlayers = sc.nextInt();
//			} else if (numberOfPlayers > 52) {
//				System.out.println("The maximum number of player this game allows is 52. \nEnter the number of players: ");
//				numberOfPlayers = sc.nextInt();
//			} else if (numberOfPlayers == 0) {
//				System.out.println("Are you sure no one wants to play? \nEnter the number of players: ");
//				numberOfPlayers = sc.nextInt();
//			} else if (numberOfPlayers < 0) {
//				System.out.println("Ghosts would probably like this game, but they can't hold cards. \nEnter the number of living players: ");
//				numberOfPlayers = sc.nextInt();
//			} else {
//				System.out.println("Ok! There will be " + numberOfPlayers + " players.");
//				validNumberOfPlayers = true;
//			}
//		}
//		for(int i = 1; i <= numberOfPlayers; i++) {
//			System.out.println("Enter the name of Player " + i + ": ");
//			playerList.put(i, sc.next());
//		}
//	return playerList;
//	}

	public HashSet<Card> getPlayerHand() {
		return playerHand;
	}


	public void setPlayerHand(HashSet<Card> playerHand) {
		this.playerHand = playerHand;
	}


	public int getPlayerScore() {
		return playerScore;
	}


	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public void describePlayerAndHand() {
		System.out.println("Player Name: " + this.playerName);
		System.out.println("Player Score: " + this.playerScore);
		System.out.println("Player Hand: " + this.playerHand);
	}
	
//	void describePlayers() {
//		playerNumber = playerList.keySet();
//		for(Integer number : playerNumber) {
//			System.out.println("Player " + number + " is " + playerList.get(number));
//		}
//	}
}

