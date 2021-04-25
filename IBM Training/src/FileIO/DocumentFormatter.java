package FileIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFormatter 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws IOException 
  {
	BufferedReader br = new BufferedReader(new FileReader("E://Format.txt"));
	String s = "";
	while (br.read() != -1)
	{
		s+=br.readLine();
	}
	System.out.println(s);
	br.close();
  }
}
