package Assignment5;

public class Tablet extends Medicine 
{
	@Override
	public void displayLabel()
	{
		System.out.println("Store in a cool dry place");
	}
	@Override
	public String toString()
	{
		return getPrice()+"\t"+getExpiry();
	}
	
}
