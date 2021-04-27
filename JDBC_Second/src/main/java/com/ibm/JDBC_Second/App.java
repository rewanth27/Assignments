package com.ibm.JDBC_Second;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/ibm_2021";
        String username="root";
        String password="1234";
        
        Connection con=DriverManager.getConnection(url,username,password);
        
        //insert values
		/*
		 * PreparedStatement
		 * pst=con.prepareStatement("insert into emp(id,name) values (?,?)");
		 * pst.setInt(1, 108); pst.setString(2, "Rewanth");
		 * 
		 * 
		 * pst.executeUpdate();
		 * 
		 * 
		 * 
		 * pst=con.prepareStatement("insert into emp(id,name) values(?,?)");
		 * pst.setInt(1, 104); pst.setString(2, "Simha"); int i=pst.executeUpdate();
		 * System.out.println(i+" record inserted");
		 */
        
        //delete
        PreparedStatement pst=con.prepareStatement("delete from emp where id= ?");
        
        pst.setInt(1, 107);
        pst.setInt(1, 104);
        int x=pst.executeUpdate();
        System.out.println(x+" record deleted");
        

        
        con.close();
        
        
    } 
}
