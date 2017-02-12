/**
Reads 10 temperatures from the user and shows which are above and which are below the average of the 10 temperatures.
*/
import java.util.Scanner;

public class ArrayOfTemperatures 
{
	public static void main(String[] args)
	{
		double[] temperature = new double[10];
		
		//Read temperature and compute their average:
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 temperatures:");
		double sum = 0;
		for (int index = 0; index < 10; index++)
	{
			temperature[index] = keyboard.nextDouble();
			sum = sum + temperature[index];
	}
	double average = sum / 10;
	System.out.println("The average temperature is " + average);
	
	int count;
	count=0;
	
	//Display each temperature and its relation to the average;
	System.out.print("The temperatures are");
	for (int index = 0; index < 10; index++)
	{
		if (temperature[index] > average)
		{
			count++;
		}
	}
	System.out.println("There were this many days with above average temperature: " + count);
	}
}		
	