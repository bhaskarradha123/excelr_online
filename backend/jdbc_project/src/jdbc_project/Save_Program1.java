package jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Save_Program1 {
	public static void main(String[] args) {
		try {
//			 Load and Register ---required packages
			DriverManager.registerDriver(new Driver());
//			 establish the connection
			String url="jdbc:mysql://localhost:3306/your_database_Name";
			String userName="root";
			String pwd="root";
			DriverManager.getConnection(url, userName, pwd);
			
			
			System.out.println("done,,,");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
