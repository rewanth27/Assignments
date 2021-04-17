package CarPoolingSystemMember;
import java.util.*;
public class Member 
{
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String contactNumber;
  private String licenceNumber;
  private Date licenceStartDate;
  private Date licenceExpiryDate;
  
  public Member() {
  }
  
  public Member(Long id, String firstName, String lastName, String email, String contactNumber, String licenceNumber,
		Date licenceStartDate, Date licenceExpiryDate)
  {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.contactNumber = contactNumber;
	this.licenceNumber = licenceNumber;
	this.licenceStartDate = licenceStartDate;
	this.licenceExpiryDate = licenceExpiryDate;
 }

 public Long getId() {
	return id;
 } 

 public void setId(Long id) {
	this.id = id;
 }

 public String getFirstName() {
	return firstName;
 }

 public void setFirstName(String firstName) {
	this.firstName = firstName;
 }

 public String getLastName() {
	return lastName;
 }

 public void setLastName(String lastName) {
	this.lastName = lastName;
 }

 public String getEmail() {
	return email;
 }

 public void setEmail(String email) {
	this.email = email;
 }

 public String getContactNumber() {
	return contactNumber;
 }

 public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
 }

 public String getLicenceNumber() {
	return licenceNumber;
 }

 public void setLicenceNumber(String licenceNumber) {
	this.licenceNumber = licenceNumber;
 }

 public Date getLicenceStartDate() {
	return licenceStartDate;
 }

 public void setLicenceStartDate(Date licenceStartDate) {
	this.licenceStartDate = licenceStartDate;
 }

 public Date getLicenceExpiryDate() {
	return licenceExpiryDate;
 }

 public void setLicenceExpiryDate(Date licenceExpiryDate) {
	this.licenceExpiryDate = licenceExpiryDate;
 }
 @Override
 public String toString()
 {
	return "Member :"+firstName+","+lastName+"\n"+"Member contact details :"+contactNumber+","+email;
 }
 @Override
 public boolean equals(Object obj)
 {
	 Member m=(Member)obj;
	 if(this.email.equalsIgnoreCase(m.getContactNumber()) && this.contactNumber.equalsIgnoreCase(m.getContactNumber()))
		 return true;
	 else
		 return false;
 }
}
