package ExceptionHandlingAssignments;

import java.util.Scanner;

public class TestAgeCalculator2 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter DOB");
		String d=sc.next();
		try
		{
			try
			{
			 AgeCalculator2 ac=new AgeCalculator2(d);
			 System.out.println("The present age is: "+ac.calculateAge(d));
			}
			catch(InvalidDOBException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		catch (InvalidInputException e)
		{
			System.out.println("Date of birth should in in dd/mm/yyyy");
		}
	}
}
