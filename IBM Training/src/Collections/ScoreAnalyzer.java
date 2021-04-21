package Collections;
import java.util.*;
public class ScoreAnalyzer
{
  private LinkedList<Integer> runsData=new LinkedList<Integer>();
  public ScoreAnalyzer(LinkedList <Integer> runsData)
  {
	  this.runsData=runsData;
  }
  public ScoreAnalyzer()
  {
	  
  }
  public LinkedList<Integer> getRunsData()
  {
	return runsData;
  }
  public void setRunsData(LinkedList<Integer> runsData) 
  {
	this.runsData = runsData;
  }
  public void addRuns(int runs)
  {
	  runsData.add(runs);
  }
  public double calcRunRate()
  {
	  double runRate=0;
	  for(int i=0; i<runsData.size(); i++)
	  {
		  runRate+=runsData.get(i);
	  }
	  double runRate1=runRate/50;
	  return runRate1;
  }
  public int lowestRunsScored()
  {
	  int num=0;
	  Collections.sort(runsData);
	  for(int i=0; i<runsData.size(); )
	  {
		  num+=runsData.get(i);
		  break;
	  }
	  return num;
  }
  
  public void displayRuns()
  {
	  int i=1;
	  for(Integer rd:runsData)
	  {
		  System.out.print((i++)+"-"+rd+" ");
	  }
	  System.out.println();
  }
}
