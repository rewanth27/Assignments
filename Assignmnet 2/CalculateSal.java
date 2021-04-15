import java.util.*;
public class CalculateSal
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the sal");
	int sal=sc.nextInt();
	
	System.out.println("Enter the no of shifts");
	int shifts=sc.nextInt();
	
	int num=calculateSal(sal,shifts);
	if(num==0)
		System.out.println("Salary too large");
	else if(shifts<0)
		System.out.println("Shifts too small");
	else if(sal<0)
		System.out.println("Salary too small");
	else
		System.out.println(num);
  }
  public static int calculateSal(int sal, int shifts)
  {
	  double savings=0;
	  if(sal>8000)
	  {
		  return 0;
	  }
	  else if(shifts<0)
	  {
		  return 1;
	  }
	  else if(sal<0)
	  {
		  return 2;
	  }
	  else
	  {
		  savings = (sal*0.5)+(sal*0.02*shifts);
		  return (int)savings;
	  }
  }
}
