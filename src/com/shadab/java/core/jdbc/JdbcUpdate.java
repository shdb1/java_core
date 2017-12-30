package com.shadab.java.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 
 * @author Mohammad Shadab
 *
 */
public class JdbcUpdate {

	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:MYORCLDB";
		String username = "System";
		String password = "orclSecure123";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "UPDATE computer SET computername=?, computermodel=?, computerprice=? WHERE computername=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "dell");
			statement.setString(2, "vostro");
			statement.setInt(3, 25000);
			statement.setString(4, "sony");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing computer was updated successfully!");
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}