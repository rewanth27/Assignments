package com.book;
import java.util.*;
public class BookStore extends Book
{
	static ArrayList<Book> a=new ArrayList<Book>();
    static Scanner sc=new Scanner(System.in);
	public void addBook(Book b)
	{
	   a.add(b);
	}
	public void searchByTitle(String key)
	{
		boolean flag=false;
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i).getTitle().equalsIgnoreCase(key))
			{
				System.out.println(a.get(i));
				flag=true;
			}
			if(flag==false)
				try
			{
				throw new InvalidBookException();
			}
			catch(InvalidBookException e)
			{
				e.getMessage();
			}
		}
	}
	public void searchByAuthor(String author)
	{
		boolean flag=false;
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i).getAuthor().equals(author))
			{
			System.out.println(a.get(i));
			flag=true;
			}
		}
		if(flag==false)
		{
			try
			{
				throw new InvalidBookException();
			}
			catch(InvalidBookException e)
			{
				e.getMessage();
			}
		}
	}
	public void displayAll()
	{
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}