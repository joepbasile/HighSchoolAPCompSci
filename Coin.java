package AP;
import java.util.Scanner;
//Joseph Basile
//Block D
//Nov 30, 2017
//Program Name:
//Description:
//

public class Coin
{
	private int myFace;
	private double myBias;
	public final int HEADS = 0;
	public final int TAILS = 0;
	
	public Coin()
	{
		myBias = .5;
	}
	
	public Coin(double bias)
	{
		if (bias> 1 || bias <0)
		{
			System.out.println("You picked a bad bias, your bias is now .5.");
			myBias = .5;
		}
		else
		{
		myBias = bias;
		}
	}
	
	//lets a person from outside the class set the bias
	public void setBias(double bias)
	{
		myBias = bias;
	}
	//will generate a random number from [0,1) then compare it to the bias and say if it is heads or tails
	public void flip()
	{
		double num = Math.random();
		if (num < myBias)
		{
			myFace = 0;
		}
		else
		{
			myFace = 1;
		}
	}
	
	//returns the face of the coin
	public int getFace()
	{
		return myFace;
	}
	
	//prints heads or tails
	public String toString()
	{
		if (myFace == HEADS)
		{
		return "Heads ";
		}
		else
		{
		return "Tails ";
		}
	}
	

}



