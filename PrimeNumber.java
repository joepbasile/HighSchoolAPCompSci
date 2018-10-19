package AP;
import java.util.Scanner;

//Joseph Basile
//Block D
//11/3/17
//PrimeNumberList
//This will ask the user for a number then give the user
// a list of all the prime numbers below the value they put in


public class PrimeNumber
{
	Scanner scan = new Scanner(System.in);
	int numLimit;
	int primeValue;
	String again ="yes";
	
	//this will introduce the user to the program
	public void intro()
	{
		System.out.println("Hello and welcome to my prime number list.");
		System.out.println("I will ask you to input a number and I will output all the prime numbers below the value you put in.");
		System.out.println("Get ready.");
	}
	
	//this will ask the user for the number the print out the list 
	public void primeList()
	{
		System.out.println("Please enter a positive number");
		numLimit = scan.nextInt();
		scan.nextLine();
		while(numLimit<0)
		{
			System.out.println("The number you entered was negative, please enter a positive number.");
			numLimit = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("This is your prime number list:");
		for(int num=1; num<numLimit; num++)//this will go up in value until it reaches the value the user entered
	    {
	        primeValue = 1; //this will be used to check if the num is prime or not later 1=prime 0= not prime
	        for(int compareNum=2; compareNum<=num/2; compareNum++)//this checks to see if the current num is prime
	        {
	            if(num%compareNum==0)//if the num is divisible by anything besides 1 and num then it is not prime
	            {
	                primeValue = 0;
	            }
	        }
	        if(primeValue==1)//if the num is prime it will print it on the list
	        {
	            System.out.print(num+" ");
	        }
	    }  
		System.out.println();
		System.out.println("Do you want to make a new list?");
		again = scan.nextLine();
	}
	
	//this will run the program then run again if the user inputs yes they would like to run again
	public void runAgain()
	{
		intro();
		while(again.equalsIgnoreCase("yes"))
		{
			primeList();
		}
		System.out.println("Thank you for using my program.");
	}
	

	public static void main(String[] args) 
	{
		PrimeNumber joe = new PrimeNumber();
		joe.runAgain();

	}

}
