package Assignment5;

abstract public class Medicine
{
  private int price;
  private String expiry;
  public Medicine() {
	  
  }
  public Medicine(int price, String expiry)
  {
	  this.price=price;
	  this.expiry=expiry;
  }
  public int getPrice()
  {
	  return price;
  }
  public void setPrice(int price)
  {
	  this.price=price;
  }
  public String getExpiry()
  {
	  return expiry;
  }
  public void setExpiry(String expiry)
  {
	  this.expiry=expiry;
  }
  public String getDetails()
  {
	  return price+"\t"+expiry;
  }
  abstract public void displayLabel();
  
}
