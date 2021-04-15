public class PrimeFromCommandLine 
{
  public static void main(String[] args) 
  {
	int num=0;
	for(int i=0; i<args.length; i++)
	{
		num+=Integer.parseInt(args[i]);
	}
	if(num==2 || num%2!=0)
	{
		System.out.println("Prime number");
	}
	else
		System.out.println("not a prime num");
  }
}
