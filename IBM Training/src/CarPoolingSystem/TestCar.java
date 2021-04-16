package CarPoolingSystem;
import java.util.*;
public class TestCar
{
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
	System.out.println("id");
	Long id=sc.nextLong();
	System.out.println("name");
	String name=sc.nextLine();
	sc.nextLine();
	System.out.println("type");
	String type=sc.nextLine();
	if(type.equalsIgnoreCase("sedan"))
	{
		System.out.println("distance");
		double distance=sc.nextDouble();
		System.out.println("abs enabled");
		boolean enabled=sc.nextBoolean();
		System.out.println("boot space");
		int space=sc.nextInt();
		Sedan se=new Sedan(enabled,space,id,name);
		System.out.println("Cost is: "+(int)se.calculateDriveCost(distance));
	}
	else if(type.equalsIgnoreCase("utility"))
	{
		System.out.println("distance");
		double distance=sc.nextDouble();
		System.out.println("Rear Cooling vents");
		boolean b=sc.nextBoolean();
		UtilityCar uc=new UtilityCar(b,id,name);
		System.out.println("Cost is: "+(int)(uc.calculateDriveCost(distance)));
	}
	else if(type.equalsIgnoreCase("hatchback"))
	{
		System.out.println("distance");
		double distance=sc.nextDouble();
		System.out.println("power windows");
		boolean b=sc.nextBoolean();
		System.out.println("automatic");
		boolean b1=sc.nextBoolean();
		HatchBack hb=new HatchBack(b,b1,id,name);
		System.out.println("Cost is: "+(int)(hb.calculateDriveCost(distance)));
	}
  }
}
