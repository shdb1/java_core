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
	
	
	/*
	 * create table computer (computername varchar2(40),computermodel varchar2(40),computerprice number)
	 * insert into computer values('dell','insipiron',20000);
	 * insert into computer values('sony','m215zoo',40000);
	 * insert into computer values('dell','vostro',15000);
     *  insert into computer values('hp','new0012',35000);
	 * */

	public static void main(String[] args) {
		//String dbURL = "jdbc:oracle:thin:@ip:port:serviceid(dbname)";
		String dbURL = "jdbc:oracle:thin:@127.0.0.1:1521:MYORCLDB";
		String username = "System";
		String password = "orclSecure123";
		//Connection conn=null;
		// ARM
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			//try{
				System.out.println("Loading Driver....");
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				//  create connection
				// conn = DriverManager.getConnection(dbURL, username, password);
			String sql = "select * from computer";
			//  create statement on connection object
			Statement statement = conn.createStatement();
			// execute query and hold result in holder resultset
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			// iterate the result
			while (result.next()){
				String name = result.getString(1);
				String model = result.getString(2);
				int price = result.getInt(3);
				String output = "Computer #%d: %s - %s - %d";
				System.out.println(String.format(output, ++count, name, model, price));
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
			/*finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}*/
	}
}