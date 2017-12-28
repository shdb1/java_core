package com.shadab.java.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**

 * @author Mohammad Shadab
 *
 */
public class JdbcInsert {

	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "root";
		String password = "secret";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "INSERT INTO computers (computername, computermodel, computerprice) VALUES (?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "dell");
			statement.setString(2, "insipiron");
			statement.setInt(3,20000);
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new computer was inserted successfully!");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}