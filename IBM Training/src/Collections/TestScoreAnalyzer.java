package Collections;
import java.util.*;
public class TestScoreAnalyzer 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	   int count=0;
	   ScoreAnalyzer sa=new ScoreAnalyzer();
		   System.out.println("Enter the marks and to end type 'STOP' ");
		   String marks=sc.nextLine();
		   String str[]=marks.split(" ");
		   for(int i=0; i<str.length; i++)
		   {
			       count++;
				   int num=Integer.parseInt(str[i]);
				   //System.out.println(num);
				   sa.addRuns(num);
			   
		   }
	   sa.displayRuns();
	   System.out.println("Run Rate is: "+sa.calcRunRate());
	   System.out.println("Lowest Runs: "+sa.lowestRunsScored());
	   System.out.println("Count of player who batted: "+count);
	}

}
