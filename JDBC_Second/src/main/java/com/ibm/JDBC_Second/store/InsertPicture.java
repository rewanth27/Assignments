package com.ibm.JDBC_Second.store;
import java.sql.*;
import java.io.*;
public class InsertPicture 
{
  public static void main(String[] args) throws Exception
  {
	  String url="jdbc:mysql://localhost:3306/ibm_2021";
	  String username="root";
	  String password="1234";
	  
	  Connection con= DriverManager.getConnection(url,username,password);
	  PreparedStatement ps=con.prepareStatement("insert into picture values (?,?) ");
	  ps.setInt(1, 2);
	  FileInputStream fis=new FileInputStream(new File("E:\\IBM\\JDBC_Second\\src\\main\\resources\\Dogs14.jpg"));
	  ps.setBinaryStream(2, fis,fis.available());
	  
	  int i=ps.executeUpdate();
	  System.out.println(i+" image inserted successfully.....");
	  
	  ps.close();
	  fis.close();
	  con.close();
  }
}
