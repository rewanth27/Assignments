package com.book;
import java.util.*;
public class BookStore extends Book
{
    static Scanner sc=new Scanner(System.in);
	public Book addBook(Book b)
	{
	  Book book=b;
	  return book;
	}
	public void searchByTitle(String key,Book book[])
	{
	  boolean flag=false;
	  for(int i=0; i<book.length; i++)
	  {
		  if(book[i].getTitle().equals(key))
		  {
			  System.out.print(book[i]);
			  flag=true;
			  break;
		  }
	  }
	  if(flag==false)
		  System.out.println("Not Found");
	}
	public void searchByAuthor(String author,Book book[])
	{
		boolean flag=false;
		  for(int i=0; i<book.length; i++)
		  {
			  if(book[i].getAuthor().equals(author))
			  {
				  System.out.print(book[i]);
				  flag=true;
				  break;
			  }
		  }
		  if(flag==false)
			  System.out.println("Not FOund");
	}
	public void displayAll(Book book[])
	{
		for(int i=0; i<book.length; i++)
		{
			System.out.println(book[i]);
		}
	}
}