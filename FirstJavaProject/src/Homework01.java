import java.util.Scanner;

public class Homework01 

{
	public static void main (String [] args)
	{
		System.out.println ("Are you are cool! 1: yes 0:no");
		int x;
		Scanner in = new Scanner(System.in);
	    x =  in.nextInt();
		
	    String cool = "you are cool!";
	    String notCool = "you are not cool!";
	    
	    do {
		
			System.out.println (cool);
			x++;
	    }	
			
		while(x > 2);
	    x++;
	//		 System.out.println(notCool);
	//		  x++;
			  
		
	

	
	}
}