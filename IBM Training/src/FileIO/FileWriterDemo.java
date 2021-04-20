package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
  public static void main(String[] args) throws IOException 
  {
	File dir=new File("E:\\");
	dir.mkdir();
	
	String s1=args[0];
	String s2=args[1];
	
	File f=new File(dir,s1);
	//System.out.println(f.exists());
	FileReader fr=new FileReader(f);
	
    String str="";
    while(fr.ready())
    {
       str+=(char)fr.read();
    }
    
    File newFile=new File(dir,s2);
    //newFile.createNewFile();
    
    FileWriter fw=new FileWriter(newFile);
    fw.write(str);
    fr.close();
    fw.close();
    
    
   }
}
