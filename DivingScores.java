import java.util.Scanner;

public class DivingScores {

	public static void main(String[] args) {
		//ask for user input
		System.out.println("Please enter degree of difficulty for the dive (1.2 - 3.8).");
		//scanner to store user input
		Scanner keyboard = new Scanner (System.in);
		float userInput = keyboard.nextFloat();
		float sum = 0;
		float min = 0;
		float max = 0;
		float finalScore = 0;
		float modifier = (float) 0.6;
		
		//save difficulty in array
	float[] difficulty;
	difficulty = new float[1];
	//check to see if difficulty is in range
	if (userInput < 3.8 || userInput > 1.2)
	{
		difficulty[0] = userInput;
		
	}
	

	

	float[] scores;
	scores = new float[7];
	
	
	for (int i = 0; i < 7; i++)
	{
		System.out.println("Judge " + (i+1) + " please enter score (0-10).");
		scores[i] = keyboard.nextFloat();
		sum = sum + scores[i];
		
		 if (scores[i] < min)
   	  {
   		  min = scores[i];
   	  }
		 if (scores[i] > max)
   	  {
   		  max = scores[i];
   	  }
		
		 
		 
		
	}
	
	sum = sum - min - max;
	finalScore = sum * difficulty[0] * modifier;
	
	System.out.println("The lowest score was " + min);
	System.out.println("The highest score was " + max);
	System.out.println("The adjusted sum is " + sum);
	System.out.printf("The final score is %.1f", finalScore);
	
	keyboard.close();
	
	
	}
}


