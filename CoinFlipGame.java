package AP;
import java.util.Scanner;
//Joseph Basile
//Block D
//Dec 6, 2017
//Program Name:
//Description:
//

public class CoinFlipGame extends Coin
{
	Scanner scan = new Scanner(System.in);
	
	private int tailSum;
	private int headSum;
	private int curTailRun;
	private int longTailRun;
	private int curHeadRun;
	private int longHeadRun;
	private double bias;
	private String again = "yes";
	
	//introduces the user to the program  
	public void intro()
	{
		System.out.println("Hello and welcome to my coin flip game.  I will have you tell me if the coin is fair or has a bias.  "
				+ "Then I will flip the coin 100 times then print out the results in a 10 by 10 square, tell you haw many heads and tails there were,"
				+ " and tell you the longest run of heads and tails");
		System.out.println("A bias of less than .5 is more likely to be heads." );
		System.out.println("A bias of .5 is a fair coin and has an equal chance of being heads or tails.");
		System.out.println("A bias of more than .5 is more likely to be tails." );
	}
	
	//this will set the bias of the coin
	public void initialize()
	{
		System.out.println("");
		System.out.println("Please input a number between 0 and 1 for your bias.");
		bias = scan.nextDouble();
		scan.nextLine();
		if (bias<0 || bias>1)
		{
			System.out.println("You put in a bad bias, the bias is now set at .5");
		}
		else
		{
			setBias(bias);
		}
	}
	
	
	public void coinFlip() 
	{
		for(int row = 0; row <= 10; row++)
		{
			for(int col = 0; col <= 10; col++)
			{
				flip();
				if(getFace() == TAILS)
				{
					tailSum++;
					curTailRun++;
					if(curTailRun > longTailRun)
					{
						longTailRun = curTailRun;
					}
					curHeadRun = 0;
				}
				else
				{
					headSum++;
					curHeadRun++;
					if(curHeadRun > longHeadRun)
					{
						longHeadRun = curHeadRun;
					}
					curTailRun = 0;
				}
			}
		}
	}
						
						
						
							
				
	//this will run the program then run again if the user inputs yes they would like to run again
		public void runAgain()
		{
			
			while(again.equalsIgnoreCase("yes"))
			{
				
			}
			System.out.println("Thank you for using my program.");
		}
}


