package com.user_app_demo.models;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class Login {
	private Statement stmt;
	private ResultSet rs;
public boolean verifyLogin(String email,String password,Connection con) {
	try {
	
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
		return rs.next();
		
		
	}
	catch(Exception e) {
		
		
	}
	return false;
}
}
