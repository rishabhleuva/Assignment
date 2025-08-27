package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

import pojo.pojo;

public class dao{
	
	public static Connection myconnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("connection not found");
		}
		
		try {
			cn= DriverManager.getConnection("jdbc:mysql://localhost/servlet","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB not found");
		}
		return cn;
	}
	
