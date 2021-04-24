package ExceptionHandlingAssignments;
import java.util.*;
public class TestAgeCalculator1 
{
  static Scanner sc=new Scanner(System.in);
  @SuppressWarnings("deprecation")
public static void main(String[] args)
  {
	System.out.println("Enter DOB");
	String d=sc.next();
	try
	{
		new Date(d);
		AgeCalculator1 ac=new AgeCalculator1(d);
		System.out.println(ac.calculateAge(d));
	}
	catch (Exception e)
	{
		System.out.println("Date of birth should in in dd/mm/yyyy");
	}
  }
}
