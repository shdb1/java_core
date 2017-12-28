package com.shadab.java.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**

 * @author Mohammad Shadab
 *
 */
public class JdbcDelete {

	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "root";
		String password = "secret";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "DELETE FROM computer WHERE computername=?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "dell");
			
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A computer was deleted successfully!");
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}