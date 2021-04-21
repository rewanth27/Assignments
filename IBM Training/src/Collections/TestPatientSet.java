package Collections;
import java.util.*;
public class TestPatientSet 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
	  Patient p1[]=new Patient[3];
	  for(int i=0; i<3; i++)
	  {
		 System.out.println("Enter the patient id");
		 int id=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the name");
		 String name=sc.nextLine();
		 System.out.println("Enter the age");
		 int age=sc.nextInt();
		 Patient p2=new Patient(id,name,age);
		 p1[i]=p2;
	  }
	  LinkedHashSet<Patient>lhs=new LinkedHashSet<Patient>(Arrays.asList(p1));
	  System.out.println(lhs.size());
	  Iterator<Patient>itr=lhs.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
  }
}
