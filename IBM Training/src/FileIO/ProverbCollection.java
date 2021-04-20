package FileIO;
import java.util.*;
import java.io.*;
public class ProverbCollection
{
  static FileOutputStream fos;
  static Scanner sc=new Scanner(System.in);
  public static void storeProverb(String proverb) throws IOException 
  {
	  File dir=new File("E://");
	  dir.mkdir();
	  File f=new File(dir,"TopProverbs.txt");
	  f.createNewFile();
	  fos =new FileOutputStream(f,true);
	  byte b[]=proverb.getBytes();
	  fos.write(b);
  }
  public static void main(String[] args) throws IOException 
  {
	  while(true)
	  {
		  sc.nextLine();
		  System.out.println("Enter a proverb or type stop");
		  String proverb=sc.nextLine(); 
		  if(proverb.equalsIgnoreCase("stop"))
		  {
			  break;
		  }
		  else
		  {
			  try
			  {
				  storeProverb(proverb);
			  }
			  catch(Exception e)
			  {
				  System.out.println("Exception.........occured");
			  }
			  finally
			  {
				  fos.close();
			  }
	
		  }
	  }
  }  
}

