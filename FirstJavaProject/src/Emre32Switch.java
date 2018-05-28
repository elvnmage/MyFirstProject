// 3.2 Write a program which will show menu on the screen with the following options:
//1 - Please input your name
//2 -  Please input you age
//3 - Please input your weight (kg and gr)
// User should type 1, 2 or 3 an press enter. Then there is a string “Inputting your …(depends on choice done before)“. After input we have to show string something like “Your weight/age/name is …”
// Then program should ask do we want to repeat or not (1 - yes, 0 - no). If no - program should say bye-bye, if yes - we have to start from the beginning

import java.util.Scanner;
public class Emre32Switch
{
public static void main(String [] args){

    Scanner userinput = new Scanner(System.in);
    char p;
    char f;
    double price = 0;
    System.out.println("First class or priority?");
    char type = userinput.next().charAt(0);
    System.out.println("How much does the package weigh? (in ounces)");
    double weight = userinput.nextDouble();

    switch (type){
     case 'p':
     if (weight > 16)
        price = weight * 3.95;

        else if (weight > 32) 
            price = (1.20 * (weight / 16));
       else
            price = 3.50 * weight;


        break;


     case 'f': 
     if (weight < 1 )
     price = 0.34;

     else if ( weight > 1)
     price = 0.34 + (weight * 21);

     else if (weight > 13)
     price = weight * 3.95;

        else if (weight > 32) 
            price = 1.20 * (weight / 16);
        else
            price = 3.50 * weight;

            break;

        }     

    System.out.println("Your price is: " +price);
    }
}