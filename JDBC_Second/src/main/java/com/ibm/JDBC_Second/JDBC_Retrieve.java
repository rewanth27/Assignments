package com.ibm.JDBC_Second;
import java.sql.*;

public class JDBC_Retrieve 
{
    public static void main(String[] args) throws Exception
    {
    	String url="jdbc:mysql://localhost:3306/ibm_2021";
        String username="root";
        String password="1234";
        
        Connection con=DriverManager.getConnection(url,username,password);
        PreparedStatement ps=con.prepareStatement("select * from emp");
        
        //ResultSet is a class
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
        }
        con.close();
	}
}
