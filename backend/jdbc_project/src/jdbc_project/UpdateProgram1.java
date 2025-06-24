package jdbc_project;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UpdateProgram1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
//		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		PreparedStatement ps = con.prepareStatement("update table_1 set email=? , address=? where id=?");
		ps.setString(1, email);
		ps.setString(2, address);
		ps.setInt(3, id);
		if(ps.executeUpdate()>0)
			System.out.println("updated ...");
		else
			System.out.println("there is no matching record to update");
//		ps.close();
//		con.close();
	}
}
