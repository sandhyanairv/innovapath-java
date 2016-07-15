package innovapath;
import java.util.Scanner;

public class SwapNumbers1 {

  public static void main(String args[])
	   {
	      int x, y, temp;
	      
	      System.out.println("Enter The Values:");
	      Scanner in = new Scanner(System.in);
	   
	      System.out.println("Enter x:");
	      x = in.nextInt();
	      System.out.println("Enter y:");
	      y = in.nextInt();
	        
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	 
	      temp = x;
	      x = y;
	      y = temp;
	 
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	   }
}
	

