package AP;
import java.util.Scanner;
import java.text.DecimalFormat;

//Joseph Basile 
//DistanceFormula 
//7/10/17
//This will ask the user to input 2 sets of points then find the distance between the two points using the distance formula

public class DistanceFormula
{
	Scanner scan = new Scanner(System.in);
	DecimalFormat dec2 = new DecimalFormat("0.00");
	
	String firstSet;
	String secondSet;
	int lengthFirstSet;
	int lengthSecondSet;
	int firstComma;
	int secondComma;
	String firstX;
	String firstY;
	String secondX;
	String secondY;
	double firstXValue;
	double firstYValue;
	double secondXValue;
	double secondYValue;
	double xValue;
	double xValuePow;
	double yValue;
	double yValuePow;
	double value;
	double distance;
	String again;
	
	//this will introduce the program to the user 
	public void intro()
	{
		System.out.println("Hello and welcome to my distance calculator.  I will ask you to give me two sets of points then I will calculate the distance between the points.");
		System.out.println("Remeber to give your points in normal point formula i.e. (_,_).");
	}
	
	//this ask the user for 2 points then it will take out the x and y value from the given points 
	public void takeOut()
	{
		System.out.println("Please give me the first point.");
		firstSet = scan.nextLine();
		System.out.println("Please give me the second point.");
		secondSet = scan.nextLine();
		//this will pull out the individual x and y values from the first point
		lengthFirstSet = firstSet.length();
		firstComma = firstSet.indexOf(',');
		firstX = firstSet.substring(1, firstComma);
		firstY = firstSet.substring(firstComma+1, lengthFirstSet-1);
		//this will pull out the individual x and y values from the second point
		lengthSecondSet = secondSet.length();
		secondComma = secondSet.indexOf(',');
		secondX = secondSet.substring(1, secondComma);
		secondY = secondSet.substring(secondComma+1, lengthSecondSet-1);
	}
	
	//this will use the x and y values to find the distance between the 2 points by using the distance formula 
	public void calculations()
	{
		firstXValue = Integer.parseInt(firstX);  //parseInt will convert the string to a numerical value
		firstYValue = Integer.parseInt(firstY);
		secondXValue = Integer.parseInt(secondX);
		secondYValue = Integer.parseInt(secondY);
		xValue = (secondXValue - firstXValue);
		xValuePow = (xValue*xValue);
		yValue = (secondYValue - firstYValue);
		yValuePow = (yValue * yValue);
		value = (xValuePow + yValuePow);
		distance = Math.sqrt(value);
	}
	
	//this will output the distance and ask the user if he wants to run it again.  
	public void output()
	{
		System.out.println("The distance between the two points is "+dec2.format(distance)+" units.");
		System.out.println("Do you want to run the program again?  Yes or no?");
		again = scan.nextLine();
	}
	
	//This will run the program then ask the user if it wants to run the program again
	//and run it again if yes
	public void runAgain()
	{
		while(again.equalsIgnoreCase("yes"))
		{
			takeOut();
			calculations();
			output();	
		}
		System.out.println("Thank you for using my program.");
	}
	
	
	public static void main(String[] args) 
	{
		DistanceFormula joe = new DistanceFormula();
		joe.intro();
		joe.takeOut();
		joe.calculations();
		joe.output();
		joe.runAgain();
	}

}
