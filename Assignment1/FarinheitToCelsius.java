package Assignment1;
import java.util.Scanner;
public class FarinheitToCelsius
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the temperature in farienheit");
	int f=sc.nextInt();
	if(f<0)
	{
		System.out.println("Invalid Input");
		System.exit(0);
	}
	
	float c=convertToCentigrade(f);
	System.out.format("%.2f", c);
  }
  public static float convertToCentigrade(int f)
  {
	  float c=((f-32)/9)*5;
	  return c;
  }
}
