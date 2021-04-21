package Collections;
import java.util.*;
public class TestPatientList implements Comparator<Patient>
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
	//1
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
	  ArrayList<Patient>al=new ArrayList<Patient>(Arrays.asList(p1));
	  
	  //2
	  System.out.println("By name's natural order");
	  Collections.sort(al);
	  for(Patient p:al)
	  {
		  System.out.println(p);
	  }
	  System.out.println();
	  
	  //3
	  System.out.println("By age's alternate order");
	  Collections.sort(al,new TestPatientList());
	  Iterator<Patient>itr=al.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println();
	  itr=al.iterator();
	  
	  //3
	  System.out.println("Using Tree Set......");
	  TreeSet<Patient>ns=new TreeSet<Patient>(Arrays.asList(p1));
	  Iterator<Patient>itr1=ns.iterator();
	  while(itr1.hasNext())
	  {
		  System.out.println(itr1.next());
	  }
	  System.out.println();
	  
	  System.out.println("Enter the name of the patient");
	  String patientName=sc.next();
	  int age= getPatientAge(patientName,ns);
	  System.out.println("The age of the patient "+patientName+" is : "+age);
  }
  //4
  public static int getPatientAge(String name, TreeSet<Patient> ts)
  {
	  int age=0;
	  Iterator<Patient>itr2=ts.iterator();
	  while(itr2.hasNext())
	  {
		  if((itr2.next()).getName().equalsIgnoreCase(name))
		  {
			  age+=itr2.next().getAge();
		  }
	  }
	  return age;
  }  
  
  @Override
  public int compare(Patient p1, Patient p2) 
  {
	return ((Integer)p2.getAge()).compareTo(p1.getAge());
  }
  
}
