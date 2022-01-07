import java.util.Scanner;       // to import the scanner utility to read user's input
/**
 * This is a driver class to the UnitPriceConverter class. It allows the user to input the data.
 * This class is a loop which runs infinitely unless the user presses 'Q' to stop it.
 *
 * @author R. Shiroya
 * @version 02-12-20
 */
public class ConverterDriver
{
    public static void main(String[] args)     
    {
        char goAgain = 'y';     // variable char for the loop
        Scanner keyboard = new Scanner(System.in);      // a scanner object to read the user's input.
        UnitPriceConverter price = new UnitPriceConverter();        // creating a new object from UnitPriceConverter class.
        
        System.out.print("Enter the price of the item: ");
        double itemPrice = keyboard.nextDouble();
        price.setItemPrice(itemPrice);      // callin get method from the UnitPriceConverter class.
        
        System.out.print("Enter the weight of the item in pounds: ");
        double weightPounds = keyboard.nextDouble();
        price.setPoundsWeight(weightPounds);        // callin get method from the UnitPriceConverter class.
        
        
        // to run a loop again and again until the user inputs 'q'
        while (goAgain == 'y')
        {
            System.out.println("\nE. Press E to edit the fields.");
            System.out.println("P. Press P to print the details.");
            System.out.println("Q. Press Q to quit the program.");
            
            char value = keyboard.next().charAt(0);
            // if else statement to provide user options.
            if(value == 'q')
            {
                
                System.out.println("Thank You. Please Come Again.");
                goAgain = 'n';      // to end the loop
            }
            else if(value == 'e')
            {    
                System.out.println("\n1. Press 1 to reset the price.");
                System.out.println("2. Press 2 to reset the weight in pounds.");
                System.out.println("3. Press 3 to print the state of the object. ");
                
                double validate = keyboard.nextDouble();
                
                if(validate == 1 )
                {
                    System.out.print("Enter the price of the item: ");
                    double newPrice = keyboard.nextDouble();
                    price.setItemPrice(newPrice);
                    System.out.println("Price Changed Successfully.");
                }
                else if (validate == 2)
                {
                    System.out.print("Enter the weight of the item in pounds: ");
                    double newWeightPounds = keyboard.nextDouble();
                    price.setPoundsWeight(newWeightPounds);
                    System.out.println("Weight Changed Successfully.");
                }
                else if (validate == 3)
                {
                    System.out.print(price);    // to print the program
                    
                }
           
                else
                System.out.println("Invalid input. Please write numbers ranging from 1-3: ");
                
            }
            else if (value == 'p')
            {
                System.out.print(price);
            }
            
            
        }
    }
}   // end of the driver class.x
