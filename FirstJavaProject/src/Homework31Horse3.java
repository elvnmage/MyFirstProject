// Task 3.1 Generate 100  number from 0 to 150 count odd even numbers

// Simplified with explaination . 



public class Homework31Horse3  								// Class name 

{ 															// Start type code from here
    	
public static void main (String [] args) 	     			// our method

    {
        int Array [] = new int [100];						// Define Array how lonf arry should be
        int counter = 0;									// start counter with 0
        int counter2 = 0;
        
        for (int x = 0; x < Array.length; x++)   			// repeat  up to array lenght
        
        {
            Array[x] = (int ) (Math.random() * 150 ); 		// fill array  with random numbers up to 150 
                                             
            System.out.println("Random Number is "+Array [x]); // print array on screen
            
            if (Array[x] % 2 == 0)   						// modulo for even
            {
            	counter++;
            	System.out.println ("Number is even.");
            }
            else 
                counter2++;
            	System.out.println ("Number is odd.");
     
        }	
    	System.out.println("Amount of even number in my Array is "+counter);
        System.out.println("Amount of even number in my Array is "+counter2);
    }

}	
        
    