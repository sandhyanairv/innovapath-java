package innovapath;
import java.io.*;
import java.util.*;

public class CmdLineInput {

	    public static void main(String args[])  {
	     
	        System.out.println("Reading input from command line");
	        System.out.println("Please enter your input:");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("your input is:");
	        String input = scanner.nextLine();
	        System.out.println("here its is:   " + input);
	    } 
}
