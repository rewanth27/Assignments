package com.bookutil;
import  com.book.*;
import java.util.*;
@SuppressWarnings("serial")
public class BookUtil
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	BookStore bs=new BookStore();
	System.out.println("Enter the details for 3 book objects");
	Book b[]=new Book[3];
	for(int i=0; i<b.length; i++)
	{
		if(i!=0)
		sc.nextLine();
		System.out.println("Enter the Book id");
		String bookId=sc.nextLine();
		if(!(bookId.startsWith("B")&& bookId.length()==4))
		{
			System.out.println("Invalid Book Id");
			System.exit(0);
		}
		System.out.println("Enter Title");
		String title=sc.nextLine(); 
		System.out.println("Enter the Author name");
		String author=sc.nextLine();
		System.out.println("Enter the category");
		String category=sc.nextLine();
		if(!(category.equals("Science")|| category.equals("Fiction")|| category.equals("Technology")|| category.equals("Others")))
		{  
			System.out.println("Invalid Category name");
			System.exit(0);
		}  
		System.out.println("Enter the price of book in decimals");
		float price=sc.nextFloat();
		if(!(price>=0))
		{
			System.out.println("Invalid Price");
			System.exit(0);
		}
		Book book=new Book(bookId, title, author,category, price);
			b[i]=bs.addBook(book);
				
	}
	
	System.out.println("Enter the title of book you want to search");
	String title=sc.next();
	bs.searchByTitle(title, b);
	
	System.out.println("Enter the author of book you want to search");
	String author=sc.next();
	bs.searchByAuthor(author, b);

  }
}
