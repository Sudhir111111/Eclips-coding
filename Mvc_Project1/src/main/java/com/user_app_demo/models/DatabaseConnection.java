package com.user_app_demo.models;

import java.sql.*;

public class DatabaseConnection {
	private Connection con;
public Connection establishConnectin() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:/localdb","root","8658");
		return con;

	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return null;

	
}
}
