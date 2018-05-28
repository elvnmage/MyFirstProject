//3.3 Bubble sort of int array

/**
 * Demonstrates several Java array examples, including a
 * Java int array, and a Java String array.
 * Created by Alvin Alexander, http://alvinalexander.com.
 */

public class Emre33Bubble
{

  public static void main(String[] args)
  {
    new Emre33Bubble();
  }

  public Emre33Bubble()
  {
    intArrayExample();
    stringArrayExample();
    intArrayExample2();
  }

  /**
   * Create an int array, then populate the array, 
   * and finally print each element in the int array.
   */
  private void intArrayExample()
  {
    int[] intArray = new int[3];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    System.out.println("intArray output");
    for (int i=0; i<intArray.length; i++)
    {
      System.out.println(intArray[i]);
    }
  }

  /**
   * Create a String array, then populate the array, 
   * and finally print each element in the int array.
   */
  private void stringArrayExample()
  {
    String[] stringArray = new String[3];
    stringArray[0] = "a";
    stringArray[1] = "b";
    stringArray[2] = "c";
    System.out.println("stringArray output");
    for (int i=0; i<stringArray.length; i++)
    {
      System.out.println(stringArray[i]);
    }
  }

  /**
   * Create a Java int array and populate it in one step.
   * Then get the array length and print each element in the array.
   */
  private void intArrayExample2()
  {
    int[] intArray = new int[] {4,5,6,7,8};
    System.out.println("intArray output (version 2)");
    for (int i=0; i<intArray.length; i++)
    {
      System.out.println(intArray[i]);
    }
  }

}