package com.ibm.J_Unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest 
{
   
  private final int x=20;
  private final int y=10;
  private Calculator calcTest=null;
  
  @BeforeEach
  public void createObject()
  {
	  calcTest=new Calculator();
  }
  @Test
  public void checkAddResult()
  {
    int result=calcTest.add(x,y);
    
    int expected=30;
    Assertions.assertEquals(expected, result);
  }
  
  @Test
  public void checkSubResult()
  {
	  int result=calcTest.sub(x, y);
	  int expected=10;
	  Assertions.assertEquals(expected, result);
  }
  
}
