package servlet_project.dao; //data access object --which deals with db logic

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class CrudOperation {
//  creating a  db logic  to save
	public int save(int id, String name, String email, long phone, String address) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into table_1 values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5, address);
		return ps.executeUpdate();
	}

}
