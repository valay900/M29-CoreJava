package org.tnsif.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class StudentDao 
{
	public Connection createConnection()
	{
		String url="jdbc:mysql://127.0.0.1:3306/fastandfurious";
		String username="root";
		String password="996068@Nn";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver Class Name");
		}
		
		Connection connection;
		try {
			connection=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("invalid Login Credentials");
			connection=null;
		}
		return connection;
	}

}