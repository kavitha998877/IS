package com.siiet.jdbcprograms;

import java.sql.*;
import javax.sql.*;//step1: import packages
public class Jdbcselect {
	public static void main(String[] args) {
// step2: load and register the driver
	//step3: establish connection
		try {
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","kavithaganta@516");
//step4:create statement
	Statement st=conn.createStatement();
	//step5:execute query
	String strselect="select booktitle,price,quantity from student";
//process the result set to display
			ResultSet rst=st.executeQuery(strselect);
	System.out.println("the records are");
	int rowcount=0;
	while(rst.next()) {
		String booktitle=rst.getString("booktitle");
		int price=rst.getInt("price");
		int quantity=rst.getInt("quantity");
		System.out.println(booktitle+" "+price+" "+quantity);
		++rowcount;
	}
		}catch(SQLException e) {
		e.printStackTrace();
	}
  
	
		
}
	}
