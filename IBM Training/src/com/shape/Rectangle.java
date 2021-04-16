package com.shape;
public class Rectangle implements Polygon
{
  private float length;
  private float breadth;
  public Rectangle(float length, float breadth)
  {
	  this.length=length;
	  this.breadth=breadth;
  }
  @Override
  public void calcArea()
  {
	  System.out.println("The area of rectangle is: "+(length*breadth));
  }
  @Override
  public void calcPeri()
  {
	  System.out.println("The pereimetere of rectangle is: "+(2*(length+breadth)));
  }
}
