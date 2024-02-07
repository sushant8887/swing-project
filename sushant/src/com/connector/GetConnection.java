package com.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdac", "root", "");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;

	}

}
