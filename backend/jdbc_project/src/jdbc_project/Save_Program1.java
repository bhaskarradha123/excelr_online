package jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Save_Program1 {

	public static void main(String[] args) {
		try {
			//Load and Register ---required packages		
			DriverManager.registerDriver(null);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
