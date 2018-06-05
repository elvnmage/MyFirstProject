//Task horse

public class Homework31Horse {
    
public static void main (String [] args)

    {
        int Array [] = new int [100];
        
        for (int i = 0; i< Array.length; i++) 
        
        {
            Array [i] = (int) (Math.random() * 150 );
            
        }
        
        for (int j = 0; j < Array.length; j++) {
            
            System.out.println("Random Number is "+Array[j]);
            
        }
    
    
    }

}