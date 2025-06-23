package jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Save_Program1 {

	public static void main(String[] args) {
		try {
			//Load and Register ---required packages		
			DriverManager.registerDriver(new Driver());
			System.out.println("done,,,");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
