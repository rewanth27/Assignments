package ExceptionHandlingAssignments;
import java.time.LocalDate;
import java.util.Date;
public class AgeCalculator1
{
  Date d=new Date();
  LocalDate year1=LocalDate.now();
  
  private String dob;
  public AgeCalculator1(String dob)
  {
	  this.dob=dob;
  }

public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int calculateAge(String dob)
  {
	  String y="";
	  char ch[]=dob.toCharArray();
	  for(int i=6; i<ch.length; i++)
	  {
		  y=y+ch[i];
	  }
	  int year=Integer.parseInt(y);
	  //System.out.println(year1.getYear());
	  int age=year1.getYear()-year;
	  return age;
  }
}
