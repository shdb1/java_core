package com.shadab.java.core.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTransactionExample {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@127.0.0.1:1521:MYORCLDB";
	private static final String DB_USER = "System";
	private static final String DB_PASSWORD = "orclSecure123";

	public static void main(String[] argv) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatementInsert = null;
		PreparedStatement preparedStatementUpdate = null;

		String insertTableSQL = "INSERT INTO computer"
				+ "(computername, computermodel, computerprice) VALUES"
				+ "(?,?,?)";

		String updateTableSQL = "UPDATE computer SET computername =? "
				+ "WHERE computermodel = ?";

		try {
			dbConnection = getDBConnection();
// make connection transaction
			dbConnection.setAutoCommit(false);

			preparedStatementInsert = dbConnection.prepareStatement(insertTableSQL);
			preparedStatementInsert.setString(1, "dell");
			preparedStatementInsert.setString(2, "inspiron");
			preparedStatementInsert.setInt(3, 200000);
			// insert
			preparedStatementInsert.executeUpdate();
			preparedStatementUpdate = dbConnection.prepareStatement(updateTableSQL);
			// preparedStatementUpdate.setString(1,
			// "A very very long string caused db error");
			System.out.println("aaaaa");
			preparedStatementUpdate.setString(1, "hp");
			preparedStatementUpdate.setString(2, "inspiron");
			System.out.println("sssss");
			// below one is bad statement- will cause transaction to fail
			preparedStatementUpdate.setString(3, "dell");
			// update
			preparedStatementUpdate.executeUpdate();
			System.out.println("aaa");

			dbConnection.commit();

			System.out.println("Transaction Done!!!!!!!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			System.out.println("Rolling back transation");
			dbConnection.rollback();
			System.out.println("rolled back");

		} finally {

			if (preparedStatementInsert != null) {
				preparedStatementInsert.close();
			}

			if (preparedStatementUpdate != null) {
				preparedStatementUpdate.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
