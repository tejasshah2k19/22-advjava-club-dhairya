package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public void insertUser(UserBean user) {

		// insert

		try {
			// dbconnection

			Connection con = DbConnection.getConnection();

			// PreparedStatement -- insert
			// Statement --insert

			// users -> userId,firstName,email,password
			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());

			// executeUpdate --> insert delete update
			// executeQuery --> select

			int records = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// CallableStatement -- PL/SQL -- curosr / function / procedure

	}

	public ArrayList<UserBean> getAllUsers() {
		ArrayList<UserBean> users = new ArrayList<UserBean>();
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from users");
			ResultSet rs = pstmt.executeQuery();// cursor -- Enumeration

			while (rs.next()) {
				UserBean user = new UserBean();
				user.setFirstName(rs.getString("firstName"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setUserId(rs.getInt("userId"));
				users.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

}
