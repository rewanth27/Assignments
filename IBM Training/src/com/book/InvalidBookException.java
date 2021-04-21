package com.book;

@SuppressWarnings("serial")
public class InvalidBookException extends RuntimeException
{
  @Override
  public String getMessage()
  {
	  return "Invalid Book Exception...";
  }
}
