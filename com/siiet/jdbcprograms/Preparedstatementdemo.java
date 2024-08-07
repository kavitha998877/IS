package com.siiet.jdbcprograms;

import java.sql.*;

public class Preparedstatementdemo {

		public static void main(String[] args) {
			  //step2:load and register the driver
		      //step3:Establish connection
			try{
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","kavithaganta@516");
				//step4:create statement
				Statement st=conn.createStatement();
				//delete record from the database 
				//String sqldelete="delete from Student where bookid=5";
				//System.out.println("the sql statement is"+sqldelete);
				//int countdeleted=st.executeUpdate(sqldelete);
				String strselect="select booktitle,price,quantity from student";
				System.out.println("the sql statement "+strselect);	
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
		}
          catch(SQLException e) {
				e.printStackTrace();
			}
		}	
}



