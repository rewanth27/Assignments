package ExceptionHandlingAssignments;

public class ExceptionTest 
{

	public static void main(String[] args) 
	{
       try
       {
    	   try
    	   {
    		   int a=Integer.parseInt(args[0]);
               int b=Integer.parseInt(args[1]);
               try
               {
               	System.out.println(a/b);             
               }
               catch (Exception e)
               {
            	   System.out.println("Division with zero is not allowed...");
               }
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("Invalid Input");
    	   }
           
       }
       catch(Exception e)
       {
    	   System.out.println("No Input Received...");
       }
	}

}
