package com.ibm.J_Unit;

public class Calculator 
{
  public Calculator()
  {
	  
  }
  
  public int add(int x, int y)
  {
	  return x+y;
  }
  
  public int sub(int x, int y)
  {
	 if(x>y)
		 return x-y;
	 else
		 return y-x;
  }
  
  public int div(int x, int y)
  {
	  return x/y;
  }
}
