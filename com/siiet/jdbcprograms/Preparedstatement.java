package com.siiet.jdbcprograms;

import java.sql.*;

public class Preparedstatement {
	public static void main(String[] args) {
		  //step2:load and register the driver
	      //step3:Establish connection
		try{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","kavithaganta@516");
			//step4:create statement
			Statement st=conn.createStatement();
			//step5:execute a sql insert statement via execute update
			String strInsert="Insert into student values(5,'mysql',7000,5)";
			System.out.println("the sql statement "+strInsert);
			int countinserted=st.executeUpdate(strInsert);
			System.out.println(countinserted+"record inserted");
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
