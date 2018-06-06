//Task 3.1 version horse simplified

public class Homework31Horse2 {
    
public static void main (String [] args)

    {
        int Array [] = new int [100];
        int counter = 0;
    
        
        for (int x = 0; x< Array.length; x++) 
        
        {
            Array[x] = (int ) (Math.random() * 150 );
                                             
            System.out.println("Random Number is "+Array [x]);
            
            if (Array[x] % 2 == 0)   
            {
            	counter++;
            	System.out.println ("Number is even.");
            }
            else 
            	System.out.println ("Number is odd.");
     
        }	
    	System.out.println("Amount of even number in my Array is "+counter);
    }
}	
        
    

