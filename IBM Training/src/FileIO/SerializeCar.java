package FileIO;
import java.util.*;
import java.io.*;
public class SerializeCar 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws FileNotFoundException, IOException 
  {
	  Car car=new Car("AP02123","Super",new Engine("0912",4567));
	  ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("E://Cardata.ser")));
	  oos.writeObject(car);
	  System.out.println("Has been written sucessfully.....");
  }
}
