package FileIO;
import java.io.*;
public class ReadBatsmanFile
{
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
  {
	FileInputStream input=new FileInputStream("E://Cricket.dat");
	ObjectInputStream ois=new ObjectInputStream(input);
	Batsman b[]=(Batsman[])ois.readObject();
	for(int i=0; i<b.length; i++)
	{
		System.out.println(b[i]);
		//System.out.println(b[i].getName());
	}
	ois.close();
  }
}
