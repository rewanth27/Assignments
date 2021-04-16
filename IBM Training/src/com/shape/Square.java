package com.shape;
public class Square implements Polygon
{
  private float side;
  public Square(float side)
  {
	  this.side=side;
  }
  public void calcArea()
  {
	System.out.println("Area of Square: "+(int)(side*side));
  }
  public void calcPeri()
  {
	  System.out.println("Perimeter of Square is: "+(int)(4*side));
  }
}
