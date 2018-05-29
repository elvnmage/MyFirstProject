/* 1.2 Write a program which will print all numbers squared between 2 numbers set up in the program. I know that it’s unclear buuuut there is example.
You have two variables - a = 3 and b = 5
Your printout should be following:
9
16
25 */
import java.util.Scanner;
public class Emre12Squared {
   public static void main(String[] args) { 

     System.out.print("\n Numbers: "); 
     int n = 3;
     int n1 = 2, n2 = 1, n3;
        if (n > 1){
            System.out.println("\n2\n1");
            for(int i = 2; i < n; ++i){
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        }
        else if (n == 1)
            System.out.println("\n2");

        else
            System.out.println("Input a positive number.");
    }
 }
