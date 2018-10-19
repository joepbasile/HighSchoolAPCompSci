package AP;
import java.util.Scanner;
//Joseph Basile and Maddie Hamas
//Block D
//Jan 9, 2018
//Program Name:PigPlayer
//Description:Programs the player to roll the dice, determine if they want to roll again, 
//keeps track of their score and sees the high score.  
//

public class PigPlayer 
{
	Scanner scan = new Scanner (System.in);
	Dice myDice = new Dice();
	private int myScore;
	private static int highScore;
	private String again = "yes";
	private String player = "";
	private boolean humanPlayer;
	private String yourOrIts = "";
	private String haveOrHas = "";
	private String loseOrLoses = "";
	
	//constructor for pig player if it is a human or computer player
	public PigPlayer(boolean playerType)
	{
		humanPlayer = playerType;
		
		//sets the names and certain words of the players
		if(playerType == true) 
		{
			player = "You";
			yourOrIts = "your";
			haveOrHas = "have";
			loseOrLoses = "lose";
		}
			
		else
		{
			player = "The computer";
			yourOrIts = "its";
			haveOrHas = "has";
			loseOrLoses = "loses";
		}
	}
	
	//keeps track of player score and turn
	public void  doTurn()
	{
		int tempScore = 0;
		int tempNum1 = 0;
		int tempNum2 = 0;
		again = "yes";
	
		while(again.equalsIgnoreCase("yes"))//as long as the player wants to roll again this will run
		{
			
			tempNum1 = myDice.roll(); 
			tempNum2 = myDice.roll();	
			System.out.println(""+player+" rolled a "+tempNum1+" and a "+tempNum2+".");
			if(tempNum1 == 1 || tempNum2 == 1) //rolled one 1 which ends turn and loses points in that turn
			{
				again = "no";
				System.out.println("OOPS! "+player+" rolled a one and "+loseOrLoses+" "+yourOrIts+" turn :(");
				tempScore = 0;
				if(tempNum1 == 1 && tempNum2 ==1) //rolled two 1s which is snake eyes- loses ALL POINTS :(
				{
					System.out.println("OH NO! "+player+" rolled snake eyes and "+loseOrLoses+" all of "+yourOrIts+" banked points :(");
					myScore = 0;
				}
			}
			else
			{
				tempScore+= tempNum1 + tempNum2;
				if(humanPlayer)//will tell player their score and ask if they want to roll again
				{
					System.out.println("YAY! "+player+" rolled a total of "+tempScore+" points this round :)");
					System.out.println("Do you want to roll again? yes or  no?");
					again = scan.nextLine();
					
				}
				else //computer player
				{
					if((Math.random()*10) + 1 <= 5)//determines if computer will roll again or end turn
					{
						System.out.println("The computer decided to end its turn.");
						again = "no";
					}
					else
					{
						System.out.println("The computer decided to roll again.");
						again = "yes";
					}
				}
			}
		}
		myScore+=tempScore;//computes the player's or computer's score at the end of the turn
		
	}
	
	//tells the player their score and what the high score is.  
	public void score()
	{
		System.out.println(""+player+" "+haveOrHas+" "+myScore+" points in the bank.");
		if(myScore>highScore)//sets new high score
			highScore = myScore;
		System.out.println("The high score is "+highScore+" points.");
	}
	
	//does a players turn then tells them their score.  
	public void play()
	{
		doTurn();
		score();
	}
	
	//gets the players score
	public int getMyScore()
	{
		return myScore;
	}
	
	//sets if the player is human or a computer
	public void setPlayer(boolean x)
	{
		humanPlayer = x;
	}
	
	//sets the points of the player/computer
	public void setPoints(int x)
	{
		myScore = x;
	}
	
	//sets the high score of the game 
	public void setHighScore(int x)
	{
		highScore = x;
	}
	

}
