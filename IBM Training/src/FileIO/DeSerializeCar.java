package FileIO;
import java.io.*;
import java.util.*;
public class DeSerializeCar 
{
    Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	  ObjectInputStream oir=new ObjectInputStream(new FileInputStream("E://Cardata.ser"));
	  Object obj=oir.readObject();
	  Car car=(Car)obj;
	  System.out.println(car);
	  oir.close();
	}

}
