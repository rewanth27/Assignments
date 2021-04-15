import java.util.Scanner;
public class Assignment1 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
	System.out.println("Enter the subjects to calculate the average");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter the subject marks...");
	for(int i=0; i<a.length; i++)
	{
		a[i]=sc.nextInt();
	}
	int num=calculateGrade(a, size);
	if(num==1)
	{
		System.out.println("First Grade");
	}
	else if(num==2)
	{
		System.out.println("Second Grade");
	}
	else if(num==3)
	{
		System.out.println("Third grade");
	}
	else if(num==-1)
	{
		System.out.println("Invalid Input");
	}
  }
  public static int calculateGrade(int a[], int size)
  {
	 boolean flag=true;
	 int avg=0;
	 int sum=0;
	 for(int i=0; i<a.length; i++)
	 {
		 if(a[i]<=0)
		 {
			 flag=false;
			 break;
		 }
	 }
	 if(flag==true)
	 {
		 for(int i=0; i<a.length; i++)
		 {
			 sum+=a[i];
		 }
		 avg=sum/size;
	 }
	 if(flag==false || a.length<0)
	 {
		 return -1;
	 }
	 else
	 {
		 if(avg>80 && avg<99)
		 {
			 return 1;
		 }
		 else if(avg>60 && avg<=80)
		 {
			 return 2;
		 }
		 else if(avg<=60)
			 return 3;
		 else
			 return -1;
	 }
  }
}
