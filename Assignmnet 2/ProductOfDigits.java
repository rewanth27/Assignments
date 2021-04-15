import java.util.*;
public class ProductOfDigits
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int product=productDigits(num);
	if(product==-1)
		System.out.println("Invalid Input");
	else
		System.out.println(product);
  }
  public static int productDigits(int num)
  {
	  if(num<0 || num>32767)
	  {
		  return -1;
	  }
	  else
	  {
		  int product=1;
		  while (num>0)
		  {
			  int rem=num%10;
			  product*=rem;
			  num=num/10;
		  }
		  return product;

	  }
  }
}
