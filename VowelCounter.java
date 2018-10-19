package AP;
import java.util.Scanner;

//Joseph Basile
//VowelCounter
//7/14/17
//This program will have the user input a sentence then count all the lower case vowels that appear in the sentence

public class VowelCounter
{
	Scanner scan = new Scanner(System.in);
	String sentence;
	int sentenceLength;
	int vowels=0;
	int spot = 0;
	char letter;
	String again;
	
	//this will introduce the program to the user
	public void intro()
	{
		System.out.println("Hello and welcome to my vowel counter program.  I will ask you to type a setence then enter it.");
		System.out.println("Then I will go through the sentence and count how may lowercase vowels appear in the sentence then tell you.");
		
	}
	
	//this will ask the user for a sentence then count the vowels in the sentence
	public void counting()
	{
		System.out.println("Please enter a sentence.");
		sentence = scan.nextLine();
		sentenceLength=sentence.length();
		
		for(spot = 0; spot<=sentenceLength-1; ++spot)//makes the switch go until it has gone through all the letters in the sentence
		{
			switch(sentence.charAt(spot)) //if the letter is a lower case vowel it will count it.  If it is not it will not do anything
			{                             //then move onto the next letter
			case 'a':
				vowels++;
				break;
			case 'e':
				vowels++;
				break;
			case 'i':
				vowels++;
				break;
			case 'o':
				vowels++;
				break;
			case 'u':
				vowels++;
				break;
			default:
				vowels=vowels;
			}
		}
	}
	
	//this will tell the user how many lower case vowels there are and then ask if they want to input another sentence
	public void output()
	{
		System.out.println("There are "+vowels+" lowercase vowels in the sentence you gave me.");
		System.out.println("Would you like to input another sentence? Yes or no?");
		again = scan.nextLine();
		vowels = 0; //resets the number of vowels for the next time the program is run.  
	}

	//This will run the program then ask the user if it wants to run the program again
		//and run it again if yes
		public void runAgain()
		{
			while(again.equalsIgnoreCase("yes"))
			{
				counting();
				output();
			}
			System.out.println("Thank you for using my program.");
		}
		
	
	
	public static void main(String[] args)
	{
		VowelCounter joe = new VowelCounter();
		
		joe.intro();
		joe.counting();
		joe.output();
		joe.runAgain();

	}

}
