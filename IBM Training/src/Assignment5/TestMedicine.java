package Assignment5;
import java.util.*;
public class TestMedicine 
{ 
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) 
 {
  
  int rand=getRandomNumber();
  if(rand==1)
  {
	  Tablet tab=new Tablet();
	  System.out.println("Enter the price and expirydate of the tablet");
	  tab.setPrice(sc.nextInt());
	  sc.nextLine();
	  tab.setExpiry(sc.nextLine());
	  System.out.println(tab);
	  tab.displayLabel();
  }
  else if(rand==2)
  {
	  Ointement oi=new Ointement();
	  System.out.println("Enter the price and expirydate of the Ointement");
	  oi.setPrice(sc.nextInt());
	  sc.nextLine();
	  oi.setExpiry(sc.nextLine());
	  System.out.println(oi);
	  oi.displayLabel();
  }
  else if(rand==3)
  {
	  Syrup sy=new Syrup();
	  System.out.println("Enter the price and expirydate of the Syrup");
	  sy.setPrice(sc.nextInt());
	  sc.nextLine();
	  sy.setExpiry(sc.nextLine());
	  System.out.println(sy);
	  sy.displayLabel();
  }
  
 }
 public static int getRandomNumber()
 {
	 Random random=new Random();
	   int rand=0;
	   while(true)
	   {
		   rand=random.nextInt(4);
		   if(rand!=0)
		   {
			   break;
		   }
	   }
	   return rand;
 }
}
