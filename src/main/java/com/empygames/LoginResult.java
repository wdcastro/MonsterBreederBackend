package com.empygames;

public class LoginResult {
	String userID;
	int loginCode;
	long authKey;
	
	public LoginResult(String userID, int loginCode, long authKey){
		this.userID = userID;
		this.loginCode = loginCode;
		this.authKey = authKey;
	}

	public String getUserID() {
		return userID;
	}

	public int getLoginCode() {
		return loginCode;
	}

	public long getAuthKey() {
		return authKey;
	}
	
	
}
