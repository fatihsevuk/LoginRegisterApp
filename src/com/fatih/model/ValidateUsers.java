package com.fatih.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ValidateUsers {
	
	public boolean checkLogin(String username , String password){
		
		
		
		try {
			
			Connection conn=DbConnection.getDbConnection();
			
			PreparedStatement psmt=conn.prepareStatement("select USER_NAME from USERS where USER_NAME=? AND PASSWORD=?");
			
			psmt.setString(1, username);
			psmt.setString(2, password);
			
			int logged=psmt.executeUpdate();
			
			if(logged>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return false;
		
		
		
		
		
		
	}
	
	
	

}
