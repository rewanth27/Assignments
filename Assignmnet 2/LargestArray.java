import java.util.*;
public class LargestArray 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("enter the values into the first array");
    for(int i=0; i<a.length; i++)
    {
    	a[i]=sc.nextInt();
    }
    int b[]=new int[size];
    System.out.println("enter "+size+" values into second array to compare");
    for(int i=0; i<b.length; i++)
    {
    	b[i]=sc.nextInt();
    }
    checkArrays(a,b,size);
  }
  public static void checkArrays(int a[], int b[], int size)
  {
	  int c[]=new int[size];
	  int i=0;
	  for(int j=0; j<a.length && j<b.length; j++)
	  {
		  if(a[j]>b[j])
		  {
			  c[i]=a[j];
			  i++;
		  }
		  else if(a[j]==b[j])
		  {
			  c[i]=a[j];
			  i++;
		  }
		  else if(a[j]<0 ||b[j]<0)
		  {
			  System.out.println("Invalid Input");
			  System.exit(0);
		  }
		  else
		  {
			  c[i]=b[j];
			  i++;
		  }
	  }
	  System.out.println("The largest elements in those arrays area");
	  for(int j=0 ;j<c.length; j++)
	  {
		  System.out.println(c[j]);
	  }
  }
}
