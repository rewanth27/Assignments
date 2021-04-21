package Collections;
import java.util.*;
public class StudentMarks
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number of Studnets");
		int size=sc.nextInt();
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		System.out.println("Enter Marks");
		for(int i=0; i<size; i++)
		{
		   l.add(sc.nextInt());
		}
		
		int num=l.get(0);
		for(int i=0; i<l.size(); i++)
		{
			if(l.get(i)>num)
			{
				num=l.get(i);
			}
		}
		System.out.println("Highest Marks are: "+num);
		
		int count=0;
		double sum=0;
		for(int i=0; i<l.size(); i++)
		{
		  count++;
		  sum+=l.get(i);	
		}
		double avg=sum/count;
		System.out.println("Average Marks: "+avg);
		
		System.out.print("Marks: ");
		int j=1;
		for(int i=0; i<l.size(); i++)
		{
			System.out.print((j++)+"-"+l.get(i)+" ");
		}
		
		for(int i=1; i<l.size()-1; i++)
		{
			if(i==3)
			{
				System.out.println("3rd Student marks are: "+l.get(i)+" ");
			}
		}
		System.out.println();
		Collections.sort(l);
		int k=1;
		System.out.print("Sorted :");
		Iterator<Integer>itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print((k++)+"-"+itr.next()+" ");
		}
	}

}
