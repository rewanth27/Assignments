import java.util.*;
public class OddEvenAverage
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	
	System.out.println("Enetr the numbers you want to do average");
	int a[]=new int[size];
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	double avg=avgOddEvenSum(a,size);
	System.out.println(String.format("%.2f", avg));
  }
  public static double avgOddEvenSum(int a[], int size)
  {
	  double even=0;
	  double odd=0;
	  double average=0;
	  for(int i=0;i<a.length; i++)
	  {
		  if(a[i]%2==0)
		  {
			  even=even+a[i];
		  }
		  else
			  odd=odd+a[i];
	  }
	  average=(odd+even)/2;
	  return average;
  }
}
