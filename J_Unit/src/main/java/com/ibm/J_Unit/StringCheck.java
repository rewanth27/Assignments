package com.ibm.J_Unit;

public class StringCheck
{
  public StringCheck()
  {
	  
  }
  
  public String removeString(String str)
  {
	  String new1="";
	  char ch[]=str.toCharArray();
	  for(int i=0; i<ch.length; i++)
	  {
		  if(ch[0]!='R'|| ch[0]!='r')
		  {
			  if(i==0)
				  ++i;
			  new1+=ch[i];
		  }
		  else
			  break;
	  }
	  return new1;
  }
}
