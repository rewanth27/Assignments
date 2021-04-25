package FileIO;
import java.io.*;
import java.util.*;
public class TestFileExplorer 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the path");
	String path=sc.nextLine();

	listAll(path);
  }
  public static void listAll(String path)
  {
	  File dir=new File(path);
	  dir.mkdir();
	  
	 File[] str=dir.listFiles();
	 for(int i=0; i<str.length; i++)
	 {
		 System.out.println(str[i]);
	 }
  }
}
