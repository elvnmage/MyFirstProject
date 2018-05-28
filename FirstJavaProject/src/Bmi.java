package bmi;


import javax.swing.* ;
import java.awt.* ;
import java.util.Arrays;
import java.util.Scanner ;

 public class Bmi {


public static void main(String[] args) {
   final int size = 20 ;
   String [] name = new String[size];
   double [] weight = new double[size];
   double [] height = new double[size];
   double [] BMI = new double[size];
   String Userquit ;
   final double BMIUnder = 18.5;
   final double BMINormal = 25.0;
   final double BMIOver  = 30.0;
   final double BMIObese = 30.0;

   int normalWeight = 0;
   int overWeight = 0 ;
   int obese = 0;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("This program calculats BMI for 20 people");
   System.out.println("Please enter name, weight and height for everyone 
   firstI");

   int person = 0;
   while(person < size)
   {
       System.out.println("Enter name");
            name[person] = keyboard.nextLine();

       System.out.println("Enter weight in pounds");
            weight[person] = keyboard.nextDouble();

       System.out.println("Ener height in inches");
            height[person] = keyboard.nextDouble();

       BMI[person] = (weight[person]*703/height[person]*height[person]);

       System.out.println("Enter Y to continue or enter anything else 
       quit");
            Userquit = keyboard.next();

       if(Userquit.equals("Y")){
           person++;
       }else 
           break;
       }

       int i = 0;
       while(i < size){
           if (BMI[person] <= BMINormal)
                   {
                       normalWeight++;
                   }else if (BMI[person] <= BMIOver)
                               {
                                    overWeight++;
                      }else
                                    obese++;

                               }
                   }

       }