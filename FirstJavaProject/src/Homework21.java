// Task 2.1
// There is int variable x with some integer value inside. 
// If it’s odd program should display “This is odd”, 
// if it’s even - “This is even”.

import java.util.Scanner;

public class Homework21 {

	public static void main (String args []) 
	
	{
	
		int x;
		System.out.println("Check number odd or even?");

		Scanner var = new Scanner (System.in);
		x = var.nextInt();
		
	if (x % 2 == 0) // modulo
	System.out.println ("Number is even.");
		
	else 
	System.out.println("Number is odd.");

	
		}
		
	}
