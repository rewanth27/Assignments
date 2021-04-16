package Assignment5;

public class Syrup extends Medicine
{
  @Override
  public void displayLabel()
  {
	  System.out.println("Only for Children");
  }
  @Override
	public String toString()
	{
		return getPrice()+"\t"+getExpiry();
	}
}
