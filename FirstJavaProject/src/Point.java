// 2.2 There is point given with x and y coordinates (for example x=5, y=-10).
// Program should print in which quarter this point is located

import java.util.Scanner;

public class Point
{
public static void main(String[] args)
{
final int WIDTH = 100; // width of the sheet in pixels
final int HEIGHT = 100; // height of the sheet in pixels

int x; // the x-coordinate
int y; // the y-coordinate
String direction; // the direction chosen

// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);

// 1. Ask the user for the ant's x-coordinate
System.out.print("Enter x-coordinate: ");
x = keyboard.nextInt();

// 2. If the x-coordinate is outside the allowed range,
// print an error message and exit
if(x < 0 || x > WIDTH-1)
{
System.out.println("The x-coordinate must be between 0 and " + (WIDTH-1));
System.exit(-1);
}


// 3. Ask the user for the ant's y-coordinate
System.out.print("Enter your y-coordinate: ");
y = keyboard.nextInt();



// 4. If the integer is outside the allowed range,
// print an error message and exit
if (y < 0 || y > HEIGHT-1)
{
System.out.println("The y-coordinate must be between 0 and "+ (WIDTH-1));
System.exit(-1);
}

// 5. Ask the user for the direction
System.out.println("Which direction would you like to move? Possible Directions are U, UR, R, DR, D, DL, L, UL");
direction = keyboard.next();

// 6. Increase or reduce the x and y-coordinates depending on the direction
if(direction.equals("U"))
{
y += 1;
}
// else if(direction.equals("UR")) ... etc

else if (direction.equals("UR"))
{
y += 1;
x += 1;
}

else if (direction.equals("R"))
{
x += 1;
}

else if (direction.equals("DR"))
{
y -= 1;
x += 1;
}

else if (direction.equals("D"))
{
y -= 1;
}

else if (direction.equals("DL"))
{
y -= 1;
x -= 1;
}

else if (direction.equals("L"))
{
x -= 1;
}

else if (direction.equals("UL"))
{
y += 1;
x -= 1;
}
// 7. If the direction is not one of the allowed values,
// print an error message and exit

else System.out.println("The direction must be either U, UR, R, DR, D, DL, L or UL ");
System.exit(-1);

// 8. "Wrap" the x and y-coordinates if the ant has walked over the edge of the paper
if(x < 0)
{
x += WIDTH;
}
// else if(x > WIDTH-1) ... etc

else if (x > WIDTH-1)
{
x += WIDTH-99;
}

else if (y < 0)
{
y += HEIGHT;
}

else if (y > HEIGHT-1)
{
y += 1;
}

// 9. Print out the new x and y-coordinates

System.out.println(" X coordinate is "+(int)x); 
System.out.println(" Y coordinate is "+(int)y);


}
}