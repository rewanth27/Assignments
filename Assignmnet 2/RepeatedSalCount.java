import java.util.*;
public class RepeatedSalCount 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	 System.out.println("Enter how many salaries you want to enter");
	 int size=sc.nextInt();
	 if(size<0)
	 {
		 System.out.println("Invalid Array Size");
		 System.exit(0);
	 }
	 int sal[]=new int[size];
	 int count=calculateSize(sal,size);
	 System.out.println(count);
  }
  public static int calculateSize(int sal[], int n)
  {
	  int count=1;
		  int a[]=new int[20];
		  for(int i = 0; i< n; i++)
		  {
			  a[i] = sc.nextInt();
			  if(a[i] < 0)
			  {
				  System.out.print("Invalid input");
				  System.exit(0);
				  }
			  }
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i+1;j<n;)
			  {
				  if(a[i]==a[j])
				  {
					  count++;
					  for(int k=j;k<n;k++)
						  a[k]=a[k+1];
					  n--;
					  }
				  else
					  j++;
				  }
			  }
	  return count;
  }
}
