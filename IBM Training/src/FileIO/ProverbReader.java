package FileIO;
import java.io.*;
public class ProverbReader extends ProverbCollection
{	
  public static void main(String[] args) throws IOException
  {
	File dir=new File("E://TopProverbs.txt");
	dir.mkdir();
	//while(fir.read()!=-1)
	//System.out.println((char)fir.read());
	FileInputStream fir=new FileInputStream(dir);
	byte b[]=fir.readAllBytes();
	String str="";
	for(int i=0; i<b.length; i++)
	{
		str+=(char)b[i];
	}
	System.out.println(str);
	fir.close();
  }
}
