package FileIO;
import java.io.*;
public class ProverbReverser 
{
  public static void main(String[] args) throws IOException
  {	  
	  FileInputStream file1=new FileInputStream("E://TopProverbs.txt");
	  byte b[]=file1.readAllBytes();
	  String str="";
	  for(int i=0; i<b.length; i++)
	  {
		  str+=(char)b[i];
	  }
	  String save=reverseWord(str);
	  
	  File directory=new File("E://");
	  directory.mkdir();
	  
	  File newFile=new File(directory,"“ReverseProverbs.txt");
	  newFile.createNewFile();
	  FileOutputStream fos=new FileOutputStream(newFile);
	  byte b1[]=save.getBytes();
	  fos.write(b1);
	  
	  FileInputStream fis=new FileInputStream(newFile);
	  byte b2[]=fis.readAllBytes();
	  String str1="";
	  for(int i=0; i<b.length; i++)
	  {
		  str1+=(char)b2[i];
	  }
	  System.out.println(str1);
	  
	  file1.close();
	  fos.close();
	  fis.close();
	  
  }
  public static String reverseWord(String str)
  {
	  String new1="";
	  String s[]=str.split(" ");
	  for(int i=0; i<s.length; i++)
	  {
		  StringBuilder br=new StringBuilder(s[i]);
		  new1+=br.reverse()+" "; 
	  }
	  return new1;
  }
}
