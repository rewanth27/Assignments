import java.util.*;
public class MaximumSum
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter how many numbers you want to add");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter the numbers into the array");
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	int total=maximumSum(a,size);
	System.out.println(total);
  }
  public static int maximumSum(int a[], int size)
  {
	 int even=0;
	// int odd=0;
	 int total=0;
	 boolean flag=true;
	 for(int i=0; i<a.length; i++)
	 {
		 if(a[i]<0)
		 {
			 flag=false;
			 break;
		 }
	 }
	 if(flag==false)
	 {
		 System.out.println("Invalid Input");
		 System.exit(0);
	 }
	 else if(size<0)
	 {
		 System.out.println("Invalid Array Size");
		 System.exit(0);
	 }
	 else
	 {
		 for(int i=0; i<a.length; i++)
		 {
			 if(a[i]%2==0)
			 {
				 even=even+a[i];
			 }
//			 else
//				 odd=odd+a[i];
		 }
		 total=even;
	 }
	 return total;
  }
}
