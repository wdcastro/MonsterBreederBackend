package com.empygames;

public class SaveData {
	UserData userdata;
	PlayerData playerdata;
	Monster monster;
	
	public SaveData(){
		
	}

	public SaveData(UserData userdata, PlayerData playerdata, Monster monster) {
		this.userdata = userdata;
		this.playerdata = playerdata;
		this.monster = monster;
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

	public PlayerData getPlayerdata() {
		return playerdata;
	}

	public void setPlayerdata(PlayerData playerdata) {
		this.playerdata = playerdata;
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
