package Assignment1;
import java.util.*;
public class Sum 
{
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args)
 {
   System.out.println("Enter the 1st number to add");
   int num1=sc.nextInt();	
   System.out.println("Enter the 2nd number");
   int num2=sc.nextInt();
   int sum=num1+num2;
   System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
 }
}
