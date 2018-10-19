package AP;
import java.util.Random;

//Joseph Basile and Maddie Hamas
//Block D
//Jan 9, 2018
//Program Name:Dice
//Description:Make a dice
//

public class Dice 
{
	private int myNumSides;
	private int mySide;
	
	
	//constructor for 6 sided die
	public Dice()
	{
		myNumSides = 6;
	}
	
	//constructor for different sided die
	public Dice(int numSides)
	{
		myNumSides = numSides;
	}
	
	//rolls the die
	public int roll()
	{
		mySide = (int) ((Math.random() * myNumSides) + 1);
		return mySide;
	}
}
