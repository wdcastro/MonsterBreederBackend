package com.empygames;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
	
	String host;
	String mode;
	
	public Game(){
		
	}
	
	
	public void setHost(String host){
		this.host = host;
	}
	
	public void setMode(String mode){
		this.mode = mode;
	}
	
	public String getHost(){
		return host;
	}
	
	public String getMode(){
		return mode;
	}
}
