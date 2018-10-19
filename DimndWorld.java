package AP;

import java.util.Scanner;
//Joe Basile 
//AP Comp Scie Block D
//10/24/17
//DimondWorld
//This will take a word with an odd number of letters then print out the word
//in a diamond shape

public class DimndWorld 
{
	Scanner scan = new Scanner(System.in);
	String word= "";
	int wordLength = 0;
	String newWord = "";
	int spaces;
	
	//this will introduce the user to the program and explain what it will do 
	public void intro()
	{
		System.out.println("Hello and welcome to my Diamond World");
		System.out.println("I will ask you for a word with an odd number of letters and print that word out in a shap of a diamond.");
		System.out.println("For example if you input zap I will output-");
		System.out.println(" z");
		System.out.println("zap");
		System.out.println(" z");
	}
	
	//this will ask the user for the word and then make a diamond out of the word then output it 
	public void makeDiamond()
	{
		System.out.println("Please enter a word with an odd number of letters to make into a diamond.");
		word = scan.nextLine();
		wordLength = word.length();
		spaces = wordLength/2;
		while(wordLength % 2 == 0 )
		{
			System.out.println("That word has an even number of letter. Please enter a new word");
			word = scan.nextLine();
			wordLength = word.length();
			spaces = wordLength/2;
		}
		
		for (int i = 0; i < wordLength; i++) 
	          System.out.println("      "+word.substring(i,2*i));

	    for (int i =5; i>0;i--)
	        System.out.println("       "+word.substring(i-1,5+(2*i)-3));
		
		
	}

	public static void main(String[] args) 
	{
		DimndWorld joe = new DimndWorld();
		
		joe.makeDiamond();
		

	}

}


