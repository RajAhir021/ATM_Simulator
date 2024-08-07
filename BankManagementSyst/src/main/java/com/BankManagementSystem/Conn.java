
//in this class connection is created between mysql and java project.

package com.BankManagementSystem;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement st;
	
	public Conn() {
		try {
			//Class.forName(com.mysql.cj.jdbc.Driver);
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","#MysqlRaj021@!!");
			st = c.createStatement();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
