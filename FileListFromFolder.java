package innovapath;
import java.io.File;

public class FileListFromFolder {
	     
	    public static void main(String a[]){
	        File file = new File("/Users/hcheviry/Desktop/Comcast");
	        File[] files = file.listFiles();
	        for(File f: files){
	            System.out.println(f.getName());
	        }
	    }
}
	
