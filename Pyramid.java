package AP;
import java.util.Scanner;

//Joseph Basile
//Pyramid
//7/17/17
//This will have the user input a number and then the program will print out a pyramid with the given number of rows.  
public class Pyramid
{
	Scanner scan = new Scanner(System.in);
	int height;
	int starNumber=1;
	String again;

	//This will introduce the user to the program
	public void intro()
	{
		System.out.println("Hello welcome to my pyramid program.  I will ask you to input a number and that will be the height for the pyramis.");
		System.out.println("For example if you input 3 the shape will turn out like this.");
		System.out.println("  *");
		System.out.println(" * * ");
		System.out.println("* * *");
	}
	
	//This will ask the user for the height and print out the shape
	public void create()
	{
		System.out.println("Please enter a number for the height.");
		height = scan.nextInt();
		scan.nextLine();
		System.out.println("Here is your shape.");
		for (int rows = height; rows > 0; rows--)//This will make the program create new rows and keep on going until it has created all right amount of rows
        {
            for (int spaces = 1; spaces <= rows; spaces++) //This will print the appropriate amount of spaces in each row until it reaches 
            {											   //the correct spot to put the first * in the row
                System.out.print(" ");
            }             
            for (int stars = 1; stars <= starNumber; stars++)//this will print the appropriate amount of * in each row. It starts with 1 star then
            {												 //it keeps putting in stars until it reaches the right amount of stars in the row
                System.out.print("* ");
            }
            System.out.println();//This will start a new row on the pyramid
            starNumber++;//As it moves down the row this increases the number of *s in each row to form the pyramid
        } 
		System.out.println("Do you want to create a new pyramid? Yes or no?");
        again=scan.nextLine();
	
    }
	
	//This will run the program then ask the user if it wants to run the program again
	//and run it again if yes
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			create();
		
			starNumber=1;
			int z =1;
		}
		System.out.println("Thank you for using my program.");
	}
	
	public static void main(String[] args) 
	{
	 Pyramid joe = new Pyramid();
	 joe.intro();
	 joe.create();
	 joe.runAgain();

	}

}
