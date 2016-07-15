import java.io.*;
import java.util.*;
import java.text.*;

public class WordCounter{
static Scanner in;
public static void main(String args[]) throws Exception

{
in = new Scanner(new FileReader("document2.txt"));

wordCount(in);


}

 
public static void wordCount(Scanner in)
{
String word;

int count1;

count1 = 0;

word = in.next();


do{

word = in.next();

count1++;

}while(!word.equals("--end--"));

 

String str1 = "The number of words in this document is: ";

System.out.println(str1 + count1);

}

}


 

 


