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
	
	// data insert // 1 row 
		public static int datainsert(pojo s) {
			int status=0;
			Connection cn= myconnection();
	String insert= "insert into login (username,password)value (?,?) ";
	 
	try {
		PreparedStatement ps= cn.prepareStatement(insert);
		ps.setString(1, s.getUsername());
		ps.setString(2, s.getPassword());

		  int a= ps.executeUpdate();
		   if(a>0) {
			    System.out.println("data inserted");
		   }

	} catch (SQLException e) {
		System.out.println("data not inserted");
	}
			return status;

		}
		// data delete 
		public static int datadelete(pojo s) {
			int status=0;
			Connection cn= myconnection();
	String delete = "delete from login where id=?";
	 
	try {
		PreparedStatement ps= cn.prepareStatement(delete);
		     ps.setInt(1, s.getId());
		      int n= ps.executeUpdate();
		       if(n > 0) {
		    	    System.out.println("data deleted");
		       }
	} catch (SQLException e) {
		System.out.println("data deleted");
	}
			return status;
		}
		// data update 
		  public static int dataupdate(pojo s) {
			      int status=0;
			      Connection cn= myconnection();
	   String update = "update login set username=?,password=? where id=?";	
	 
	try {
		PreparedStatement ps= cn.prepareStatement(update);
		ps.setString(1, s.getUsername());
		ps.setString(2, s.getPassword());
		ps.setInt(3, s.getId());
		    int a=  ps.executeUpdate();
		     if(a>0) {
		    	  System.out.println("data updated");
		     }
	} catch (SQLException e) {
		System.out.println("data not updated");
	}
	 
				return status;
}

	
		  public static List<pojo> alldata() {
			    List<pojo> al = new ArrayList<pojo>();

			    Connection cn = myconnection();

			    String fetch = "select * from login";

			    try {
			        PreparedStatement ps = cn.prepareStatement(fetch);

			        ResultSet rs = ps.executeQuery();

			        while (rs.next()) {
			            pojo s = new pojo();
			            s.setId(rs.getInt(1));
			            s.setUsername(rs.getString(2));
			            s.setPassword(rs.getString(3));

			            al.add(s);
			        }

			    } catch (SQLException e) {
			        System.out.println("data fetch error");
			    }

			    return al;
			}
}		

