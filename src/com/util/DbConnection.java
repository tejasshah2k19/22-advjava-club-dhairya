package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		String driver = "com.mysql.cj.jdbc.Driver";// class ->
		String url = "jdbc:mysql://localhost:3306/test";// test -->name
		String userName = "root"; //
		String password = "root";

		Connection con = null;

		try {
			// load class
			Class.forName(driver);

			// establish the connection
			con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) {
		getConnection();
	}
}
