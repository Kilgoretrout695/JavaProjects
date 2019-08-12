import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.util.*;
public class FileSum {
	

	public static void main(String[] args) {
		
		
		// try catch method to make sure files are input correctly
		try
		{
			//user asked to input file name
			//scanners used to read input then file information
			System.out.println("Please enter file name: ");
			Scanner keyboard = new Scanner (System.in);
			String userInput = keyboard.nextLine();
			Scanner sc = null;
			int lineCount = 0;
			//new scanner for user input file
				   sc = new Scanner(new FileInputStream(userInput)); 
				  
				   keyboard.close();
				  //float num = sc.nextFloat();
			//counts number of lines in file	   
			while(sc.hasNextFloat())
			{
				lineCount++;
				sc.nextFloat();
				
			}
			
			float numbers[];
			numbers = new float[lineCount];
			float sum = 0;
			//resets file scanner
			float average = 0;
			float min = 0;
			float max = 0;
			
			
			sc = new Scanner(new FileInputStream(userInput)); 
			
				  //while a new number is available, add number to array
			//then add new number to sum total
				   while (sc.hasNextFloat()) 
				   {
					   
					 for (int i = 0; i < lineCount ; i++)
					 {
					   numbers[i] = sc.nextFloat();
					   System.out.println(numbers[i]);
					  
					   sum = sum + numbers[i];
					   
					   if (numbers[i] < min)
				    	  {
				    		  min = numbers[i];
				    	  }
				    	  
					   if (numbers[i] > max)
				    	  {
				    		  max = numbers[i];
				    	  }
				    	  
				
					 }
					 
					
					 
					 		   
		}
				   
				   average = sum/lineCount;
				   
				System.out.println("The sum of the numbers in this file is " + sum); 
				System.out.println("The mean of these numbers is " + average);
				System.out.println("The largest number is " + max);
				System.out.println("The smallest number is " + min);
				sc.close();
	
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally 
		{
			System.out.println("Program is ending");
	
		}
		
	}

}
