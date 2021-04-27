package com.ibm.JDBC_Second.store;
import java.sql.*;
import java.io.*;
public class FileInsert 
{
	static String url="jdbc:mysql://localhost:3306/ibm_2021";
	static String username="root";
	static String password="1234";
	public static void main(String[] args) throws Exception
	{
	  Connection con=DriverManager.getConnection(url,username,password);
	  PreparedStatement ps=con.prepareStatement("insert into filedb values (?,?)");
	  File f=new File("E:\\IBM\\JDBC_Second\\src\\main\\resources\\textfile.txt");
	  FileReader fr=new FileReader(f);
	  ps.setInt(1, 105);
	  ps.setCharacterStream(2, fr, (int)f.length());//setCharacterStream() is neccesary to add a file related to text.if we give there as object it throws not serializable object exception.
	  //in the above line f.length is not necessary.......
	  int i=ps.executeUpdate();
	  System.out.println(i+" file text added");
	  
	  con.close();
	  ps.close();
	  //receiving the file from database
	}
}
