package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Jdbcconnect {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","rootpassword");
		Statement s  = con.createStatement();
		ResultSet res = s.executeQuery("select name from student");
		
		String name= res.getString("name");
		
		System.out.println(name);
		
	}

}
