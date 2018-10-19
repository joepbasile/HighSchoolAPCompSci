package AP;
import java.util.Scanner;
import java.util.Random;

//Joseph Basile 
//PhoneNumber
//7/6/17
//This program will print out a random a 10 digit phone number with certain restrictions like the first 3 numbers can't be an 8 or 9, 
//the first number can't be a 0, and the second set of numbers cannot be higher than 742.
public class PhoneNumber
{
	Scanner scan = new Scanner(System.in);
	Random gen = new Random();
	String again;
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	int num10;

	//this will introduce the user to the program and explain it to them.
	public void intro()
	{
		System.out.println("Hello and welcome to my phone number generator.  I will give you a new random phone number.");
		System.out.println("The first number will not be a 0, the first 3 numbers will not have a 8 or 9, and the second set of numbers will not be higher than 742");
		System.out.println("Get ready for your phone number.");
	}
	
	//this will randomly generate the numbers in the phone number
	public void generate()
	{
		num1 = gen.nextInt(7)+1;
		num2 = gen.nextInt(8);
		num3 = gen.nextInt(8);
		num4 = gen.nextInt(8);
		num5 = gen.nextInt(5);
		num6 = gen.nextInt(3);
		num7 = gen.nextInt(10);
		num8 = gen.nextInt(10);
		num9 = gen.nextInt(10);
		num10 = gen.nextInt(10);
	}
	
	//this will print out the phone number
	public void output()
	{
		System.out.println("This is your new phone number.  Enjoy!");
		System.out.println(num1+""+num2+""+num3+"-"+num4+""+num5+""+num6+"-"+num7+""+num8+
				""+num9+""+num10);
		System.out.println("Would you like to generate a new phone number?  Yes or no?");
		again = scan.nextLine();
	}
	
	//This will run the program then ask the user if it wants to run the program again
	//and run it again if yes
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			generate();
			output();
		}
		System.out.println("Thanks you for using my program.");
	}

	public static void main(String[] args)
	{
		PhoneNumber joe = new PhoneNumber();
		joe.intro();
		joe.generate();
		joe.output();
		joe.runAgain();
	}

}
