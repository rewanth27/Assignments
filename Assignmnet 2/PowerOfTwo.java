import java.util.*;
public class PowerOfTwo 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the number to check whether the number is power of 2 or not");
	int num=sc.nextInt();
	while(num%2==0)
	  {
	   num=num/2;
	  }
	  if(num==1)
	  {
	   System.out.println("Yes");
	  }
	  else if(num<0)
		  System.out.println("Number is too snall");
	  else if(num>32767)
		  System.out.println("Number is too large");
	  else
	  {
		  System.out.println("No");
	  }
  }
}
