package ExceptionHandlingAssignments;
import java.time.LocalDate;
import java.util.*;
public class AgeCalculator2 
{
	Date d=new Date();
	  LocalDate year1=LocalDate.now();
	  
	  private String dob;
	  public AgeCalculator2(String dob)
	  {
		  this.dob=dob;
	  }

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@SuppressWarnings("deprecation")
	public int calculateAge(String dob) throws InvalidDOBException ,InvalidInputException
	  {
		  String y="";
		  String date="";
		  char ch[]=dob.toCharArray();
		  for(int i=6; i<ch.length; i++)
		  {
			  y=y+ch[i];
		  }
		  for(int i=0; i<=1;i++)
		  {
			  date+=ch[i];
		  }
		  int year=Integer.parseInt(y);
		  //System.out.println(year1.getYear());
		  int age=year1.getYear()-year;
		  
		  if(Integer.parseInt(date)>d.getDay())
		  {
			  throw new InvalidDOBException();
		  }
		  
		  try
		  {
			  new Date(dob);
		  }
		  catch(Exception e)
		  {
			  throw new InvalidInputException();
		  }
		  return age;
	  }

}
