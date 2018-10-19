package AP;
import java.util.Scanner;

//Joseph Basile and Maddie Hamas
//Block D
//Jan 9, 2018
//Program Name:PigGame
//Description:This will have the computer and player play the Pig game until someone reaches a set score to win the game
//

public class PigGame 
{
	PigPlayer myHumanPlayer = new PigPlayer(true);
	PigPlayer myComputerPlayer = new PigPlayer(false);
	
	private int goalScore = 0;
	Scanner scan = new Scanner(System.in);
	private String gameOver = "no";
	private String runAgain = "yes";
	String first = "";
	
	
	//this will introduce the user to the Pig game
	public void intro()
	{
		System.out.println("Hello and welcome to Maddie and Joe's PIG game. Here we will tell you the rules and how the game works.");
		System.out.println("When it is your turn you will roll two dice.");
		System.out.println("If you roll a 1 then you will lose your points accumulated during your turn and your turn will end.");
		System.out.println("If you roll snake eyes then you lose ALL your points and your turn ends.");
		System.out.println("You can roll however many time during your turn but to collect your points you must end your turn.");
		System.out.println("Get ready to play!");
	}
	
	//this will determine who gets the first turn, the computer or player.
	public void firstTurn()
	{
		
		System.out.println("Do you want to roll first or second?");
		first = scan.nextLine();
		if(first.equalsIgnoreCase("first"))
		{
			System.out.println("You will go first.");
		}
		else
		{
			System.out.println("You will go second.");
		}
	}
	
	//asks player what the score the game will go up then sets it to that value
	public void setScore()
	{
		System.out.println("What do you want to play to? Please input a whole positive number.");
		goalScore = scan.nextInt();
		scan.nextLine(); //clears input stream
	}
	
	//plays the pig game until player or computer wins 
	public void playGame()
	{
		while(gameOver.equals("no"))
		{
			if(first.equalsIgnoreCase("first"))	//this is if the player decides to roll first.
			{
				myHumanPlayer.play();
				System.out.println();//spaces player turn from computer turn
				if(myHumanPlayer.getMyScore() >= goalScore)//sees if the player's score is above or equal to the score needed to win
				{
					System.out.println("Congratulations you win! :) ");
					gameOver = "yes";//ends game
				}
				else //players score is too low to win so the computer rolls.
				{
					myComputerPlayer.play();
					System.out.println();
					if(myComputerPlayer.getMyScore() >= goalScore)//sees if the computer's score is above or equal to the score needed to win
					{
						System.out.println("Congratulations the computer win! :) ");
						gameOver = "yes";//edns game
					}
				}
			}
			else 	//This is if the player decides to roll second. 
			{
				myComputerPlayer.play();
				System.out.println();
				if(myComputerPlayer.getMyScore() >= goalScore)//sees if the computer's score is above or equal to the score needed to win
				{
					System.out.println("Congratulations the computer win! :) ");
					gameOver = "yes";//ends game
				}
				else
				{
					myHumanPlayer.play();
					System.out.println();
					if(myHumanPlayer.getMyScore() >= goalScore)//sees if the player's score is above or equal to the score needed to win
					{
						System.out.println("Congratulations you win! :) ");
						gameOver = "yes";//ends game
					}
				}
			}
		}
	}
	
	//go through the game then at the end asks if the player wants to play again.  Also resets variables.
	public void playGameRunAgain()
	{
		intro();
		while (runAgain.equalsIgnoreCase("yes"))
		{
			firstTurn();
			setScore();
			playGame();
			myHumanPlayer.setPoints(0);
			myComputerPlayer.setPoints(0);
			myHumanPlayer.setHighScore(0);
			gameOver = "no";
			System.out.println("Do you want to play the game again?  Yes or no?");
			runAgain = scan.nextLine();
		}
		System.out.println("Thank you for playing Joe and Maddie's Pig Game!  Hope you enjoyed it. :)");
		
	}
}
