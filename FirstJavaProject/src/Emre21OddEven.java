//2.1 There is int variable x with some integer value inside. 
//If it’s odd program should display “This is odd”, if it’s even - “This is even”.

import java.util.Scanner;
public class Emre21OddEven {

	public static void main(String [] args)
	{
		int x;
		System.out.println("Check odd or even?");
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if (x % 2 == 0)
		System.out.println("Your number is even.");
		
		else 
		System.out.println("Your number is odd.");
	}
	
}