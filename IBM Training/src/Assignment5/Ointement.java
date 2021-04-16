package Assignment5;

public class Ointement extends Medicine
{
  @Override
  public void displayLabel()
  {
	  System.out.println("For External Use only...........");
  }
  @Override
	public String toString()
	{
		return getPrice()+"\t"+getExpiry();
	}
}
