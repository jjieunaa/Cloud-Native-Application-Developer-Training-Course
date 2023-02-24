package book.test;

import java.sql.Connection;

import book.util.ConnectionManager;

public class ConnectionTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		conn = ConnectionManager.getConnection();
		if (conn!=null) {
			System.out.println(conn);
		}

	} // main
} // class
