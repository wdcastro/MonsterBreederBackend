package com.empygames;

public class LoginResult {
	UserData userdata;
	int logincode;
	
	public LoginResult(UserData userdata, int logincode){
		this.userdata = userdata;
		this.logincode = logincode;
	}

	public UserData getUserdata() {
		return userdata;
	}

	public void setUserdata(UserData userdata) {
		this.userdata = userdata;
	}

	public int getLogincode() {
		return logincode;
	}

	public void setLogincode(int logincode) {
		this.logincode = logincode;
	}

	
	
	
}
