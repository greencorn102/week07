package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;


public class DbConnection {
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	private static String PASSWORD = "projects"; 
	private static String HOST = "localhost"; 
	private static int PORT = 3306;
	
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
		
		System.out.println("connecting to " + uri);
		try {
			Connection connec=DriverManager.getConnection(uri);
			System.out.println("connection established");
			return connec;
		}   catch (SQLException e) {
			throw new DbException();
		}
		  
			// TODO Auto-generated catch block
			//e.printStackTrace();
		
	
	// TODO Auto-generated constructor stub
	}

}
