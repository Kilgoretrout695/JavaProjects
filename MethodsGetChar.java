import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class MethodsGetChar {
	

	public static void main(String[] args) 
	{
		//System.out.println("Please enter a phrase.");
		
		getArray();
	
		Scanner keyboard = new Scanner (System.in);
		//stores next integer input, used to determine array size
		int arraySize = keyboard.nextInt();
		int count = 0;	
		//saves string
		String userInput = keyboard.nextLine();
		
	
		
		String[] phrases;
		phrases = new String[arraySize];
		

		
		
		getChar(userInput, phrases, count, arraySize);
		showString(count, phrases, arraySize);
		howMany(count, phrases, arraySize);
		getPosition(count, phrases, arraySize);

	
	}
	
	public static void getChar(String userInput, String[] phrases, int count, int arraySize)
	{
		for(count = 0; count < arraySize; count++)
		{
			System.out.println("Please enter a phrase: ");
			Scanner keyboard = new Scanner (System.in);	
			String input = keyboard.nextLine();
		
		phrases[count] = input;
		
		
		}
		
	
		
		//System.out.println("Here is the string: " + input);
		
	
		//String str = input;
		
		//System.out.println("Character in position 6 is "+ str.substring(6,7));
		
	}
	
	public static void howMany(int count, String[] phrases, int arraySize)
	{
		for (count = 0; count < arraySize; count++)
		{
		System.out.println("String in element " + count + " has " + phrases[count].length() + " characters.");;
		}
		}
	
	public static void showString(int count, String[] phrases, int arraySize)
	{
		for (count = 0; count < arraySize; count++)
		{
			
		System.out.println("String in element " + count + " is:" + phrases[count]);
		}
	}

	public static void getArray()
	{
		System.out.println("How many phrases will you store?");
		
	}
	public static void getPosition(int count, String[] phrases, int arraySize)
	{
		System.out.println("Please choose an element.");
		Scanner keyboard = new Scanner (System.in);	
		int arrayChoose1 = keyboard.nextInt();
		int chosenElement = arrayChoose1;
		System.out.println("Please enter a position ");
		int arrayChoose2 = keyboard.nextInt();
		int charPosition = arrayChoose2;
		String theOne = phrases[chosenElement].substring(charPosition, charPosition+1);
		
		System.out.println("In element " + chosenElement + " the character in position " + charPosition + " is " + theOne);
	
		
		
	}
}
