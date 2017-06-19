package com.empygames;

public class SaveData {
	UserData userdata;
	Monster monster;
	
	public SaveData(){
		
	}

	public UserData getUserdata() {
		return userdata;
	}

	public void setUserdata(UserData userdata) {
		this.userdata = userdata;
	}


	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}


	public void exists(){
		if(userdata == null){
			System.out.println("userdata is null");
		} 
		if(monster == null){
			System.out.println("monster is null");
		}
	}
}
