package ExceptionHandlingAssignments;

@SuppressWarnings("serial")
public class InvalidDOBException extends Exception
{
  @Override
  public String getMessage()
  {
	  return "Date of Birth cannot be after the current date";
  }
}
