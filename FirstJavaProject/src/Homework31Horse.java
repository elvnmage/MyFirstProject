//Task 3.1 version horse

public class Homework31Horse {
    
public static void main (String [] args)

    {
        int Array [] = new int [100];
        
        for (int x = 0; x< Array.length; x++) 
        
        {
            Array [x] = (int) (Math.random() * 150 );
            
        }
        
        for (int y = 0; y < Array.length; y++) {
            
            System.out.println("Random Number is "+Array[y]);
            
        }
    
    
    }

}