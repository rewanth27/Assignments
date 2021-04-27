//practise a bit more heavier here.......
package com.ibm.JDBC_Second.store;

import java.sql.*;
import java.io.*;
public class ReceivedFileDataFromDatabase 
{
  public static void main(String[] args) throws Exception
  {
	  String url="jdbc:mysql://localhost:3306/ibm_2021";
	  String username="root";
	  String password="1234";
	  
	  Connection con= DriverManager.getConnection(url,username,password);
	  PreparedStatement ps= con.prepareStatement("select * from filedb");
	  ResultSet rs=ps.executeQuery();
	  Clob cl=null;
	  Reader reader=null;
	  while(rs.next())
	  {
	   cl=rs.getClob(2);
	   reader=cl.getCharacterStream();
	  }
	  FileWriter fr=new FileWriter ("E:\\IBM\\JDBC_Second\\src\\main\\resources\\receivedfile.txt");
	  
	  int i;
	  while((i=reader.read())!=-1)
	  {
		  fr.write((char)i);
	  }
	  
	  fr.close();
	  System.out.println("success");
	  con.close();
	  rs.close();
	  ps.close();
  }
}
