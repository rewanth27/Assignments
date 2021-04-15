import java.util.*;
import java.util.Map.Entry;
public class HighestFeedBack
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the size of array 1");
	int size=sc.nextInt();
	if(size<0)
	{
		System.out.println("Invalid array size");
		System.exit(0);
	}
	
	int a[]=new int[size];
	int b[]=new int[size];
	
	System.out.println("Enter the id and score "+size+" times");
	for(int i=0;i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0; i<b.length; i++)
	{
		b[i]=sc.nextInt();
	}
	highestFeedBack(a,b,size);
  }
  public static void highestFeedBack(int metlife[],int hardfort[],int size)
  {
	  int count=0;
	  for(int i=0; i<metlife.length; i++)
	  {
		  for(int j=i+2; j<metlife.length; j++)
		  {
			  if(i%2==0)
			  {
				  if(metlife[i]==metlife[j] && j!=-2)
				  {
					  count++;
					  metlife[j]=-1;
					  break;
				  }
			  }
		  }
	  }
	  for(int i=0; i<hardfort.length; i++)
	  {
		  for(int j=i+2; j<hardfort.length; j++)
		  {
			  if(i%2==0)
			  {
				  if(hardfort[i]==hardfort[j] && j!=-2)
				  {
					  count++;
					  hardfort[j]=-1;
					  break;
				  }
			  }
		  }
	  }
	  int feedback[]=new int[size-count];
	  int i=0;
	  for(int j=0; j<metlife.length; j++)
	  {
		  if(metlife[j]!=-1)
		  {
			  feedback[i++]=metlife[j];
			  feedback[i++]=metlife[++j];
		  }
	  }
	  for(int j=0; j<hardfort.length; j++)
	  {
		  if(hardfort[j]!=-1)
		  {
			  feedback[i++]=hardfort[j];
			  feedback[i++]=hardfort[++j];
		  }
	  }
	  for(int k=0; k<feedback.length; k++)
	  {
		  System.out.println(feedback[k]);
	  }
  }
}
