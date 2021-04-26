package ativ_fix_jdbc_ChristianoCorrea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	private static Test conexaoUtil;

	public static Test getInstance() {
		if (conexaoUtil == null) {
			conexaoUtil = new Test();
		}
		return conexaoUtil;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
	}

	public static void main(String[] args) {
		try {
			System.out.println(getInstance().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
