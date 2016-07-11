package com.fatih.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getDbConnection(){
		
		Connection conn=null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:testorcl","system","18081991Fth");
			
			if(conn!=null){
				System.out.println("veri tabaný baðlantýsý baþarýlý");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	
	
	
}
