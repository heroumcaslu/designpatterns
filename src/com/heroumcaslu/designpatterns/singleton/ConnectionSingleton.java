package com.heroumcaslu.designpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
	
	private static Connection uniqueConnection;

	private ConnectionSingleton() {
		
		//Constructor
		
	}
	
	public static synchronized Connection getInstance() {
		
		if(uniqueConnection == null) {
			
			try {
				
				String url = "jdbc:mysql://localhost:3306/banco";
				String user = "root";
				String password = "";
				
				uniqueConnection = DriverManager.getConnection(url, user, password);
				
				return uniqueConnection;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return uniqueConnection;
		
	}
	
}
