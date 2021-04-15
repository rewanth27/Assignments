import java.util.*;
public class ElementCount
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the number of elements you want to enter");
	int size=sc.nextInt();
	if(size<0)
	{
		System.out.println("Invalid Array Size");
		System.exit(0);
	}
	System.out.println("Enter the numbers into array");
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
	System.out.println("Enter the number you want to see the occurence");
	int key=sc.nextInt();
	int count=findElementCount(a,size,key);
	System.out.println("the number of occurences of the given number: "+key+" is "+count);
  }
  public static int findElementCount(int a[],int size, int key)
  {
	 int count=0;
	 for(int i=0; i<size; i++)
	 {
		 if(a[i]==key)
		 {
			 count++;
		 }
	 }
	 return count;
  }
}
