

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbCon {

	static final String URL = "jdbc:mysql://localhost/carmng";
	static final String USERNAME = "root";
	static final String PASSWORD = "pirooporoo";

	public static void  sqlexcute(String sqlstate) {

		String carname = sqlstate;

		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement preStatement = con.prepareStatement("insert into product (name) values(?);")) {

			preStatement.setString(1, carname);
			int count = preStatement.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}