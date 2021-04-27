package com.ibm.JDBC_Second.store.transaction;
import java.sql.*;
import java.io.*;
public class TransactionManagement 
{
	 public static void main(String[] args) throws Exception
	 {
		 String url="jdbc:mysql://localhost:3306/ibm_2021";
		 String username="root";
		 String password="1234";  	
		 Connection con=DriverManager.getConnection(url,username,password);
		 con.setAutoCommit(false);
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 while(true)
		 {
			 PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?)");
			 String s1=br.readLine();
			 int id=Integer.parseInt(s1);
			 ps.setInt(1, id);
			 
			 String s2=br.readLine();
			 ps.setString(2, s2);
			 
			 String s3=br.readLine();
			 ps.setString(3, s3);
			 
			 ps.executeUpdate();
			 System.out.println("commit/rollback");
			 String option=br.readLine();
			 if(option.equalsIgnoreCase("commit"))
			 {
				 con.commit();
			 }
			 if(option.equalsIgnoreCase("rollback"))
			 {
				 con.rollback();
			 }
			 
			 System.out.println("Do you want to add another record (y/n)");
			 String retry=br.readLine();
			 if(retry.equalsIgnoreCase("n"))
			 {
				 break;
			 }
		 }
		 con.close();
     }
}
