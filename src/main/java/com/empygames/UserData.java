package com.empygames;

public class UserData {
	String userID;
	long authKey;
	
	public UserData(){
		
	}
	
	public void setUserID(String userID){
		this.userID = userID;
	}
	
	public void setAuthKey(long authKey){
		this.authKey = authKey;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public long getAuthKey(){
		return authKey;
	}
}
