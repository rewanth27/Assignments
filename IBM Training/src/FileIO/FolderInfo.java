package FileIO;

import java.io.File;

public class FolderInfo 
{
  public static void printDirectory(File f)
  {
	 try
	 {
		 String folders[]= f.list();
		 for(String f1:folders)
		 {
			 System.out.println("File: "+"<"+f1+">"+"Absolute File path :"+f.getAbsolutePath()+"Folder Path :"+f.getCanonicalPath());
		 }
	 }
	 catch (Exception e)
	 {
		 System.out.println("No Folder exists with the given name");
	 }
  }
  public static void main(String[] args)
  {
	File f=new File("E://");
	f.mkdir();
	printDirectory(f);
  }
}
