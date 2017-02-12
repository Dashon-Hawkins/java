/**
 * File name: PercentOfSum.java
 * 
 *This is  a class to build an array of integers and display their sum and a list of the values along with their % contribution to the s sum.
 * 
 */
import java.util.*;
public class PercentOfSum
{
	public static void main(String[] args)
	{
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter?");
		int thisMany;
		thisMany = keyboard.nextInt();
		System.out.println();
		
		int[] theList = new int[thisMany];
		int index;
		int sum;
		int percent;
		
		System.out.println("Enter " + thisMany + "numbers,");
		System.out.println("one per line.");
		
		for (index = 0; index < thisMany; index++)
		{
			System.out.println("Enter number " + (index + 1) + ":");
			theList[index] = keyboard.nextInt();
		}

		System.out.println(); 
		System.out.println("You have filled the array with ");
		System.out.println(thisMany + "numbers."); 
		System.out.println ( ) ; 
		
		sum = addUpValues(theList, thisMany); 
		
		System.out.println(); 
		System.out.println("The sum of the numbers = " + sum); 
        System.out.println(); 
        System.out.println("Here are the numbers and their ") ; 
        System.out.println("percent contribution to the sum. ") ; 
        System.out.println(); 
        
        for(index = 0; index < thisMany; index++)
           	System.out.println (theList[index] + " is "
        		+ (int) (((double)theList[index]/sum)*100 + 0.5)
        		+ "% of the sum.");
        System.out.println();
	}
	
	public static int addUpValues (int[] listOfValues, int
listLegnth)
	{
		int total = 0; 
		for(int i = 0; i < listLegnth; i++)
			total = total + listOfValues[i];
	
		return(total);
	}
}