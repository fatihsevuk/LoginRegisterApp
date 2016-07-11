package com.fatih.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterUsers {
	
	public boolean registerUser(String userName , String passWord , String country){
		
		boolean isRegister=false;
		
		try {
			
			Connection conn=DbConnection.getDbConnection();
			
			PreparedStatement psmt=conn.prepareStatement("insert into USERS VALUES(?,?,?)");
			psmt.setString(1, userName);
			psmt.setString(2,passWord);
			psmt.setString(3,country);
			
			int success=psmt.executeUpdate();
			
			if(success>0){
				
				isRegister=true;
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isRegister;
		
		
	}
	
	
	

}
