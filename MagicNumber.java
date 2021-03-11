import java.util.Scanner;
public class MagicNumber 
{ 
  
    // Driver Method 
    public static void main(String args[]) 
    { 
      Scanner in = new Scanner(System.in)
      int x;
      
      System.out.println("Enter a number to check whether it is magic number or not.");
      
      x = in.nextInt();
      
        // Accepting sample input but am initializing already for example :D
        //int x = 1234; 
  
        // Condition to check Magic number 
        if (x % 9 == 1) 
        {
            System.out.println("Magic Number"); 
        }
        else
        {
            System.out.println("Not a Magic Number"); 
        }
    } 
} 
