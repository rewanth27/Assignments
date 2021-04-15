import java.util.*;
public class FindCricketerId
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	boolean flag=true;
	System.out.println("Enter the number of elements");
	int size=sc.nextInt();
	if(size<0)
	{
       System.out.println("Invalid Array Size");
       System.exit(0);
	}
	
	int a[]=new int[size];
	for(int i=0; i<size; i++)
	{
		a[i]=sc.nextInt();
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
	System.out.println("Enter the score");
	int score=sc.nextInt();
	if(score<0)
	{
		System.out.println("Invalid Score");
		System.exit(0);
	}
	else
	findCricketerId(a,size,score);
  }
  public static void findCricketerId(int a[], int size, int score)
  {
	  	  for(int i=0; i<a.length; i++)
		  {
			if(a[i]>score)
		    {
			   System.out.println(a[i-1]);
		     }
	      }
  }
}
