package Assignment1;

public class CommandLinePrimeOrNot
{
  public static void main(String[] args)
  {
    for(int i=0; i<args.length; i++)
    {
    	int num=Integer.parseInt(args[i]);
    	if(num%2!=0 || num==2)
        System.out.println("Prime");
    	else
        System.out.println("Not Prime");
    }
  }
}
