import java.util.Scanner;

public class ArrayCalculations
{
   public static void main(String[] args)
   {
      int numScores; // Variable to hold the number of scores
     
      // Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of scores from the user
      System.out.print("How many test scores do you have? ");
      numScores = keyboard.nextInt();
     //int scoreCount = 0; 
     

      // Create an array to hold the scores. This array will have space
      // to store the exact number of values specified by the user. Note
      // that each score is a double. The name of the array is "scores"
      // ***************************************************************
      
      double[] scores;
    		 scores = new double[numScores];
    
    		

      // Use a for-loop to get the scores from the user and store them
      // in the scores array. The number of scores specified by the user
      // determines the loop iterations.
      // ***************************************************************

      for (int index = 0; index < scores.length; index++ )
      {  // ******** body of the for-loop ********
    	
         System.out.print("Enter score #" + (index + 1) + ": ");
         scores[index] = keyboard.nextDouble();
         
      }

      // Use a for-loop to determine the average score in the array and
      // then display this average value
      // ***************************************************************
      double total = 0;
      
      for (int index = 0; index < scores.length; index++)
      {
    	  total = total + scores[index];
    	  
      }
      
      double average = total / scores.length;
      System.out.printf("The average of the scores is %.1f", average);
      System.out.println(" ");

      // Use a for-loop to determine the lowest score in the array and
      // then display this lowest value
      // ***************************************************************
      double min = scores[0];
      for (int index = 0; index < scores.length; index++)
      {
    	  if (scores[index] < min)
    	  {
    		  min = scores[index];
    	  }
    	  
      }
      System.out.println("The lowest scores is " + min);
      // Use a for-loop to determine the highest score in the array and
      // then display this highest value
      // ***************************************************************
      double max = scores[0];
      for (int index = 0; index < scores.length; index++)
      {
    	  if (scores[index] > max)
    	  {
    		  max = scores[index];
    	  }
    	  
      }
      System.out.println("The highest scores is " + max);
      keyboard.close();
   }
}