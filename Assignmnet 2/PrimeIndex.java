import java.util.*;
public class PrimeIndex
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter how many elements you want to add");
	int size=sc.nextInt();
	if(size<0)
	{
		System.out.println("Invalid Array Size");
		System.exit(0);
	}
	
	System.out.println("Enter the elements into array");
	int a[]=new int[size];
	for(int i=0; i<a.length; i++)
	{
		int num=sc.nextInt();
		if(num>=0)
		a[i]=num;
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
	int avg=primeIndexSum(a,size);
	System.out.println(avg);
  }
  public static int primeIndexSum(int a[], int size)
  {
	  int avg=0;
	  int sum=0;
	  int count=0;
	  for(int i=0; i<size; i++)
	  {
		  if((i+1)%2!=0)
		  {
			  count++;
			  sum=sum+a[i];
		  }
	  }
	  avg=sum/count;
	  return avg;
  }
  
}
