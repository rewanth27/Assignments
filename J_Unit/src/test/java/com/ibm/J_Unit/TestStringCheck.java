package com.ibm.J_Unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStringCheck
{
  private final String name="Rewanth";
  private StringCheck sc=null;
  
  @BeforeEach
  public void createObject()
  {
	  sc=new StringCheck();
  }
  
  @Test
  public void checkForRequirement()
  {
	  String s=sc.removeString(name);
	  String expected="ewanth";
	  Assertions.assertEquals(expected, s);
  }
}
