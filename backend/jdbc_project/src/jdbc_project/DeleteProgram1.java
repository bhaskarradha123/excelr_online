package jdbc_project;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class DeleteProgram1 {
	static Connection con;
	static PreparedStatement ps;
	public static void main(String[] args) throws SQLException {	
		try {
			// Load and Register
			DriverManager.registerDriver(new Driver());
//		Establish the connection
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
//		creation of statement
			 ps =con.prepareStatement("delete from table_1 where id=1");
//	   Execution of statement		
			 ps.execute();
			 System.out.println("deleted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
//		closing the resources
			ps.close();
			con.close();
			
		}
	}
}
