package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadProgram_1 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from table_1");
		ResultSet res = ps.executeQuery();
		while (res.next()) {
			int id = res.getInt("id");
			String name = res.getString("name");
			String email = res.getString(3);
			long mobile = res.getLong(4);
			String address = res.getString(5);

			System.out.println(id+"--"+name+"--"+email+"--"+mobile+"--"+address);
		}

	}
}
