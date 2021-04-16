package com.test;
import com.shape.*;
import java.util.*;
public class AreaAndPereimetere 
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("Enter the side of the square");
	Square s=new Square(sc.nextInt());
	s.calcArea();
	s.calcPeri();
	
	System.out.println("---------------------------------------------------------------");
	System.out.println("Enter the values for length and breadth for calculating the area and pereimetere of rectangle");
	float l=sc.nextFloat();
	float b=sc.nextFloat();
	Rectangle r=new Rectangle(l,b);
	r.calcArea();
	r.calcPeri();
  }
}
