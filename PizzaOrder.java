import java.util.Scanner;  // Needed for the Scanner class

/**
   This program allows the user to order a pizza.
*/

public class PizzaOrder
{
   public static void main (String[] args)
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner (System.in);

      String firstName;             // User's first name
      boolean discount = false;     // Flag for discount
      int inches;                   // Size of the pizza
      char crustType;               // For type of crust
      String crust = "Hand-tossed"; // Name of crust
      double cost = 12.99;          // Cost of the pizza
      final double TAX_RATE = .08;  // Sales tax rate
      double tax;                   // Amount of tax
      char choice;                  // User's choice
      String input;                 // User input
      String toppings = "Cheese ";  // List of toppings
      int numberOfToppings = 0;     // Number of toppings
      int crustCase = 0;
      String owner1 = "Mike";
      String owner2 = "Diane";
     
      

      // Prompt user and get first name.
      System.out.println("Welcome to Mike and " +
                         "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();
      if (firstName.equals(owner1) || firstName.equals(owner2) ) 
      {
    	  discount = true;
    	  System.out.println("You have a discount");
      }

      // Determine if user is eligible for discount by
      // having the same first name as one of the owners.
      // ADD LINES HERE FOR TASK #1

      // Prompt user and get pizza size choice.
      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " +
                         "would you like?");
      System.out.print("10, 12, 14, or 16 " +
                       "(enter the number only): ");
      inches = keyboard.nextInt();
      if (inches == 10)
      {
    	  cost = 10.99;
      }
      else if (inches == 12)
      {
    	  cost = 12.99;
      }
      else if (inches == 14)
      {
    	  cost = 14.99;
      }
      else if (inches == 16)
      {
    	  cost = 16.99;
      }
      
      else 
      {
    	  inches = 12;
    	  cost = 12.99;
      }
    	  
    	 
    	  
    	  
      // Set price and size of pizza ordered.
      // ADD LINES HERE FOR TASK #2

      // Consume the remaining newline character.
      keyboard.nextLine();

      // Prompt user and get crust choice.
      System.out.println("What type of crust " +
                         "do you want? ");
      System.out.print("(H)Hand-tossed, " +
                       "(T) Thin-crust, or " +
                       "(D) Deep-dish " +
                       "(enter H, T, or D): ");
      input = keyboard.nextLine();
      crustType = input.charAt(0);
      switch(crustCase)
      {
      case 1: crustType = 'H';
      break;
      case 2: crustType = 'h';
      break;
      case 3: crustType= 'T';
      break;
      case 4: crustType= 't';
      break;
      case 5: crustType = 'D';
      break;
      case 6: crustType= 'd';
      break;
      default: crustType = 'H';
      break;
     
      }
      if (crustCase == 1 || crustCase == 2)
      {
    	  crust = "Hand-Tossed";
    			  
      }
      else if (crustCase == 3 || crustCase == 4)
      {
    	  crust = "Thin-Crust";
      }
      
      else if (crustCase == 5 || crustCase == 6)
      {
    	  crust = "Deep-dish";
      }
      else 
      {
    	  crust = "Hand-Tossed";
      }
     
      // Set user's crust choice on pizza ordered.
      // ADD LINES FOR TASK #3

      // Prompt user and get topping choices one at a time.
      System.out.println("All pizzas come with cheese.");
      System.out.println("Additional toppings are " +
                         "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " +
                         "Onion, Mushroom");

      // If topping is desired,
      // add to topping list and number of toppings
      System.out.print("Do you want Pepperoni? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }
      System.out.print("Do you want Sausage? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }
      System.out.print("Do you want Onion? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onion ";
      }
      System.out.print("Do you want Mushroom? (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushroom ";
      }

      // Add additional toppings cost to cost of pizza.
      cost = cost + (1.25 * numberOfToppings);

      // Display order confirmation.
      System.out.println();
      System.out.println("Your order is as follows: ");
      System.out.println(inches + " inch pizza");
      System.out.println(crust + " crust");
      System.out.println(toppings);

      // Apply discount if user is eligible.
      // ADD LINES FOR TASK #4 HERE
      if (discount == true)
      {
    	  System.out.println("You are elligible for a $2.00 discount");
    	  cost = cost - 2;
      }
      else 
      {
    	  System.out.println ("You are not elligible for a discount");
    	  
      }
      // EDIT PROGRAM FOR TASK #5
      // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
      System.out.printf("The cost of your order " +
                        "is: $%6.2f\n", cost);

      // Calculate and display tax and total cost.
      tax = cost * TAX_RATE;
      System.out.printf("The tax is: $%6.2f\n", tax);
      System.out.printf("The total due is: $%6.2f\n",
                        (tax + cost));

      System.out.println("Your order will be ready " +
                         "for pickup in 30 minutes.");
   }
}