package Day4;

  class Circle implements Shape
  {
	    private double radius;
		
		public Circle() {}
		
		public Circle(double radius)
		 {
			this.radius = radius;
		}
		@Override
		public double calculateArea() 
		{
			return 3.14 * radius * radius;
		}	
  }
  class Elipse extends Circle
  {
		//Cannot override the final method from Circle
	    @Override
		public  double calculateArea()
		{
			return 3.14 * 11 * 11;
		}
  }
  class Rectangle implements Shape
  {
		private double length;
		private double width;
		
		public Rectangle(double length, double width)
		{
			super();
			this.length = length;
			this.width = width;
		}
		@Override
		public double calculateArea()
		{
			// TODO Auto-generated method stub
			return length * width;
		}
  }
  public class ShapeDemo
  {
  public static void main(String[] args)
  {
			//Shape shape = new Shape();

			Circle circle = new Circle();
			System.out.println(circle.calculateArea());		
			
			Rectangle rectangle = new Rectangle(10.0, 5.0);
			System.out.println(rectangle.calculateArea());
			
			Shape shape = new Circle(20);
			System.out.println(shape.calculateArea());
			
			shape = rectangle;
			System.out.println(shape.calculateArea());
			
		
		}
  }
