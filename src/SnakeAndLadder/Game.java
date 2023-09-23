package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	Board board;
	Dice dice;
	Deque<Player> playerList=new LinkedList<>();
	Player winner;
	
	public Game() {
		initializeGame();
	}

	private void initializeGame() {
		//here I am taking hardcoded value but you can take input
		board=new Board(10,5,4);
		dice=new Dice(1);
		winner=null;
		addPlayers();
		System.out.println("Hi i am here2");
	}

	private void addPlayers() {
		Player player1 = new Player("p1",0);
		Player player2 = new Player("p2",0);
		playerList.add(player1);
		playerList.add(player2);
	}
	
	public void startGame() {
		while(winner==null) {
			 //check whose turn now
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
            }
		}
		System.out.println("WINNER IS:" + winner.id);
	}

	private int jumpCheck(int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;


	}

	private Player findPlayerTurn() {
		 Player playerTurns = playerList.removeFirst();
	     playerList.addLast(playerTurns);
	     return playerTurns;
	}
	
}
