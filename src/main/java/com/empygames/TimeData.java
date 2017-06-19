package com.empygames;

public class TimeData {
	
	long timestamp = System.currentTimeMillis();
	String userID;
	//hex
	
	public TimeData(String userID){
		this.userID = userID;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public long getTimestamp(){
		return timestamp;
	}
}
