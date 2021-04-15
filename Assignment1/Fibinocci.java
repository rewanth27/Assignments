package Assignment1;
import java.util.*;
public class Fibinocci
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("1.first ten numbers\n2.odd numbers less than 100\n3.even numbers between 100 and 1000\n4.sum of numbers less than 100");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	 case 1:firstTenNum();
	        break;
	     
	 case 2:oddNum();
	        break;
	       
	 case 3:evenNum();
	        break;
	        
	 case 4:sumLessThan();
	        break;
	}
  }
  public static void firstTenNum()
  {
	  int num1=0;
	  int num2=1;
	  int disp=0;
	  System.out.println(num1);
	  for(int i=2; i<=10; i++)
	  {
		  disp=num1+num2;
		  System.out.println(disp);
		  num1=num2;;
		  num2=disp;
	  }
  }
  public static void oddNum()
  {
	  int num1=0;
	  int num2=1;
	  int disp=0;
	  System.out.println(num1);
	  for(int i=2; i<1000; i++)
	  {
		  disp=num1+num2;
		  if(disp>=0 && disp<=100 && disp%2!=0)
		  {
			  System.out.println(disp);
		  }
		  num1=num2;;
		  num2=disp;
	  }
  }
  public static void evenNum()
  {
	  int n1 = 0, n2 = 1, num;
      for (int i = 100; i < 1000; i++)
      { 
			num = n2 + n1; 
			if(num>=100 && num<=1000)
			System.out.println(num); 
			n1 = n2; 
			n2 = num; 
	  }
  }
  public static void sumLessThan()
  {
	  int n1 = 0, n2 = 1, num;
	  int sum=0;
      for (int i = 100; i < 1000; i++)
      { 
			num = n2 + n1; 
			sum=sum+num;
			if(sum>=0 && sum<=100)
			System.out.println(num); 
			n1 = n2; 
			n2 = num; 
	  }
	  
  }
  
}
