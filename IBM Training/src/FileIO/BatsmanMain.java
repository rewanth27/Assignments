package FileIO;
import java.io.*;
import java.util.*;
public class BatsmanMain
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
	Batsman batsman[]=new Batsman[3];
	for(int i=0; i<3; i++)
	{
		//sc.nextLine();
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		sc.nextLine();
		System.out.println("Enter the innings");
		int innings=sc.nextInt();
		
		System.out.println("Enter the total Runs");
		int totalRuns=sc.nextInt();
		Batsman b=new Batsman(id,name,innings,totalRuns);
		batsman[i]=b;
		
	}
	File dir=new File("E://");
	dir.mkdir();
	File f=new File(dir,"Cricket.dat");
	f.createNewFile();
	FileOutputStream fo=new FileOutputStream(f);
    ObjectOutputStream oos=new ObjectOutputStream(fo);
    oos.writeObject(batsman);
    
    System.out.println("Written sucessfully");
    oos.close();
	
  }
}
