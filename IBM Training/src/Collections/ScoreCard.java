package Collections;
import java.util.*;
import java.util.Map.Entry;
public class ScoreCard 
{
  static Map<String,Integer> m=new LinkedHashMap<String,Integer>();
  static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) 
  {
	
	System.out.println("Enter the runs scored");
	String score=sc.nextLine();
	String str[]=score.split(" ");
	for(int i=0; i<str.length; i++)
	{
		getTheMain(str[i]);
	}
    Set<Entry<String,Integer>>s=m.entrySet();
    Iterator<Entry<String,Integer>>itr=s.iterator();
    System.out.println("Players who have batted...");
    while(itr.hasNext())
    {
    	Entry<String,Integer>e=itr.next();
    	System.out.println(e.getKey());
    }
    if(itr.hasNext()==false)
    	itr=s.iterator();
    
    System.out.println();
    
    System.out.println("Scores by players...");
    
    int scorep=0;
    Iterator<Entry<String,Integer>>itr1=s.iterator();
    while(itr1.hasNext())
    {
    	Entry<String,Integer>e=itr1.next();
    	System.out.println(e.getKey()+":"+e.getValue());
    	if(e.getValue()>scorep)
    		scorep=e.getValue();
    }
    if(itr1.hasNext()==false)
    	itr1=s.iterator();
    System.out.println();
    
    int totalScore=0;
    Iterator<Entry<String,Integer>>itr2=s.iterator();
    while(itr2.hasNext())
    {
    	Entry<String,Integer>e=itr2.next();
    	if(scorep==e.getValue())
    	{
    		System.out.println("Name of Highest Scorer: "+e.getKey());
    	}
    	totalScore+=e.getValue();
    }
    if(itr2.hasNext()==false)
    	itr2=s.iterator();
    
    System.out.println();
    	Iterator<Entry<String,Integer>>itr3=s.iterator();
        while(itr3.hasNext())
        {
        	Entry<String,Integer>e=itr3.next();
        	if(e.getKey().equalsIgnoreCase("Dhoni"))
        	{
        		System.out.println("Runs scored by "+e.getKey()+" : "+e.getValue()+"\n");
        	}
        }
      
        System.out.println("Total Score: "+totalScore);

   }

  public static void getTheMain(String str)
  {
	  String s[]=str.split("-");
	  for(int i=0; i<s.length; i++)
	  {
		 m.put(s[i], Integer.parseInt(s[++i]));
	  }
  }
}
