package Collections;

public class Patient implements Comparable<Patient>
{
  private int patientId;
  private String name;
  private int age;
  public Patient()
  {
	  
  }
  public Patient(int patientId, String name, int age) 
  {
	this.patientId = patientId;
	this.name = name;
	this.age = age;
  }
  public int getPatientId() 
  {
	return patientId;
  }
  @Override
  public String toString() 
  {
	return "patientId=" + patientId + ", name=" + name + ", age=" + age;
  }
  public void setPatientId(int patientId) 
  {
	this.patientId = patientId;
  }
  public String getName() 
  {
	return name;
  }
  public void setName(String name) 
  {
	this.name = name;
  }
  public int getAge() 
  {
	return age;
  }
  public void setAge(int age) 
  {
	this.age = age;
  }

 @Override
  public int compareTo(Patient p)
 {
	return this.getName().compareTo(p.getName());
 }
 
 @Override
 public boolean equals(Object obj)
 {
	 Patient p=(Patient)obj;
	 if (this.getPatientId()==p.getPatientId())
	 {
		 return true;
	 }
	 return false;
 }
 @Override
 public int hashCode()
 {
	 return this.patientId;
 }
}
