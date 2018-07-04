package com.xtkj.tlx.until;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbuntils {
	private String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String url="jdbc:sqlserver://localhost:1433;DataBaseName=Tule";
	private String user="sa";
	private String password="1";
	public Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
