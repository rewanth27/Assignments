//works only for 3 digit numbers
import java.util.*;
public class GenerateNewNumber
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int count=checkCount(num);
	int lastnum=lastNum(num);
	int num1=0;
		while(count>0)
		{
			num1=num1*10+lastnum;
			++lastnum;
			count--;
		}
	System.out.println(num1);
  }
  public static int checkCount(int num)
  {
	  int count=0;
	  while (num>0)
	  {
		int rem=num%10;
		count++;
		num=num/10;
	  }
	  return count;
  }
  public static int lastNum(int num)
  {
	  int last=0;
	  while(num>0)
	  {
		  int rem=num%10;
		  last=last+rem;
		  break;
	  }
	  return last;
  }
}
