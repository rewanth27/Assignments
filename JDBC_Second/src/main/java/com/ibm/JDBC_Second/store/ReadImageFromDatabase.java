package com.ibm.JDBC_Second.store;
import java.io.*;
import java.sql.*;
public class ReadImageFromDatabase
{
  public static void main(String[] args) throws Exception
  {
	  String url="jdbc:mysql://localhost:3306/ibm_2021";
	  String username="root";
	  String password="1234";
	  
	  Connection con= DriverManager.getConnection(url,username,password);
	  PreparedStatement ps=con.prepareStatement("select * from picture");
	  ResultSet rs=ps.executeQuery();
	  
	  
	  rs.next();
	  
	   Blob b=rs.getBlob(2);
	   
	   byte b1[]=b.getBytes(1, (int)b.length());
	  
	  
	  FileOutputStream fr=new FileOutputStream ("E:\\IBM\\JDBC_Second\\src\\main\\resources\\newImg.jpeg");
	  fr.write(b1);
	  
	  System.out.println("written image succesfully");
	  fr.close();
  }
}
