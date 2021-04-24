package ExceptionHandlingAssignments;
import java.util.*;
@SuppressWarnings("serial")
public class TestCustomer extends InvalidInputException
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
	 System.out.println("Enter the customer no");
	 String custNo=sc.nextLine();
	 if(custNo.startsWith("C")|| custNo.startsWith("c"))
	 {
	  System.out.println("Enter the Customer name");
	  String custName=sc.nextLine();
	  if(custName.length()>=4)
	  {
	   System.out.println("Enter the category");
	   String category=sc.nextLine();
	   if(category.equalsIgnoreCase("platinum")||category.equalsIgnoreCase("Gold")|| category.equalsIgnoreCase("silver"))
	   {
	   Customer c=new Customer(custNo, custName, category);
	   System.out.println(c);
	   }
	   else
		   throw new InvalidInputException();
	  }
	  else
	  {
		  throw new InvalidInputException();
	  }
	 }
	 else
	 {
		 throw new InvalidInputException();
	 }
  }
}
