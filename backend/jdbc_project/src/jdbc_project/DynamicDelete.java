package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DynamicDelete {
		static Connection con;
		static PreparedStatement ps;
		public static void main(String[] args) throws SQLException {	
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter id to delete your data");
			int id=scanner.nextInt();	
			try {
				// Load and Register
				DriverManager.registerDriver(new Driver());
//			Establish the connection
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
//			creation of statement
				 ps =con.prepareStatement("delete from table_1 where id=? ");
				 ps.setInt(1, id);
//		   Execution of statement		
				int res = ps.executeUpdate();
				if(res>0)
				 System.out.println(id+" data deleted "+res+" rows");
				else
					System.out.println("there is no record with "+id +" to delete");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
//			closing the resources
				ps.close();
				con.close();
				
			}
		}
	
}
