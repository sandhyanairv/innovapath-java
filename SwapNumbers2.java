package innovapath;
import java.util.Scanner;

public class SwapNumbers2 {
	 
	    public static void main(String a[]){
	    	
	    	int x, y;
	        System.out.println("Enter The Values:");
	        Scanner in = new Scanner(System.in);
	   
	        System.out.println("Enter x:");
	        x = in.nextInt();
	        System.out.println("Enter y:");
	        y = in.nextInt();
	        
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	    }
}
