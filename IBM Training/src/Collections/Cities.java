package Collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Cities
{
  Scanner sc=new Scanner(System.in);
  public static void main(String[] args) throws IOException
  {
	LinkedHashSet<String>stateSet=new LinkedHashSet<String>();
    File dir=new File("E://");
    dir.mkdir();
    File file1=new File(dir,"states.txt");
    BufferedReader br=new BufferedReader(new FileReader(file1));
    while(br.ready())
    {
    	String str=br.readLine();
    	stateSet.add(str);
    }
    System.out.println("The total number of states are: "+stateSet.size());
    System.out.println();
    
    stateSet.remove("Delhi");
    if(stateSet.contains("Delhi")==false)
    {
    	System.out.println("Delhi has been removed sucessfully from set!!!!!");
    	System.out.println();
    }
    else
    	System.out.println("There is some error in this program");
    
    Iterator<String>itr=stateSet.iterator();
    while(itr.hasNext())
    {
    	String s=itr.next();
    	if(s.startsWith("K"))
    		System.out.println(s);
    }
    System.out.println();
    
    TreeSet<String>ts=new TreeSet<String>(stateSet);
    for(String s:ts)
    {
    	System.out.println(s);
    }
    br.close();
  }
}
