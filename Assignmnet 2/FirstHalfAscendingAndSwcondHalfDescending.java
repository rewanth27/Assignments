import java.util.*;
public class FirstHalfAscendingAndSwcondHalfDescending 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	    System.out.println("Enter the size");
	    int size=sc.nextInt();
	    int a[]=new int [size];
	    System.out.println("Enter the elements into array");
	    for(int i=0; i<a.length; i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    printOrder(a, size);
	  
  }
  public static void printOrder(int[] a, int size)
  {
	  Arrays.sort(a);
	  System.out.println("Fist half as ascending: ");
	  for (int i = 0; i < size / 2; i++) 
	      System.out.println(a[i]);
	  
	  System.out.println("Second half as descending: ");
	  for (int j = size - 1; j >= size / 2; j--)
	      System.out.print(a[j]+" ");
	}
}
