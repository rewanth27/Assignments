package FileIO;
import java.io.*;
public class TestFile
{
  public static void main(String[] args) throws IOException
  {
	  File dir1=new File("E://Badminton");
		dir1.mkdir();
		
		
		  File file1=new File(dir1,"singles.txt"); 
		  file1.createNewFile();
		  
		  File f1=new File(dir1, "dubbles.txt");
		  f1.createNewFile();
		  
		  File dir2=new File("E://Badminton//courts");
		  dir2.mkdir();
		  
		  File file2=new File(dir2,"smash.dat");
		  file2.createNewFile();
		  
		  dir1.mkdir();
		  File f4=new File(dir1,"doubles.txt");
		  f1.renameTo(f4);
		  
		  System.out.println(file1.delete());
		  f1.delete();
		 
  }
}
