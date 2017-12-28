package com.shadab.java.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**

 * @author Mohammad Shadab
 *
 */
public class JdbcSelect {

	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "root";
		String password = "secret";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "SELECT * FROM computer";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			
			while (result.next()){
				String name = result.getString(1);
				String model = result.getString(2);
				int price = result.getInt(3);
				String email = result.getString("email");
				
				String output = "Computer #%d: %s - %s - %d";
				System.out.println(String.format(output, ++count, name, model, price));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}