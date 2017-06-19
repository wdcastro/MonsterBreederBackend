package com.empygames;

public class Monster {
	/*
	 *   owner:string;
  name:string;
  level:number;
  species:string;
  pictureUrl:string;
  experience:number;
  expToNext:number;

  hunger:number = 5;
  maxhunger:number = 5;
  health:number = 5;
  hungerstrike:number = 0;
  healthstrike:number = 0;

  hp:number;
  atk:number;
  def:number;
  spd:number;
  eva:number;

  hpgrowth:number;
  atkgrowth:number;
  defgrowth:number;
  spdgrowth:number;
  evagrowth:number;
	 */
	
	String owner;
	String name;
	int level;
	String species;
	String pictureUrl;
	float experience;
	float expToNext;
	
	int hunger;
	int maxhunger;
	int health;
	int hungerstrike;
	int healthstrike;
	
	int hp;
	int atk;
	int def;
	int spd;
	int eva;
	
	int hpgrowth;
	int atkgrowth;
	int defgrowth;
	int spdgrowth;
	int evagrowth;
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public float getExpToNext() {
		return expToNext;
	}
	public void setExpToNext(float expToNext) {
		this.expToNext = expToNext;
	}
	public int getHunger() {
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public int getMaxhunger() {
		return maxhunger;
	}
	public void setMaxhunger(int maxhunger) {
		this.maxhunger = maxhunger;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHungerstrike() {
		return hungerstrike;
	}
	public void setHungerstrike(int hungerstrike) {
		this.hungerstrike = hungerstrike;
	}
	public int getHealthstrike() {
		return healthstrike;
	}
	public void setHealthstrike(int healthstrike) {
		this.healthstrike = healthstrike;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public int getEva() {
		return eva;
	}
	public void setEva(int eva) {
		this.eva = eva;
	}
	public int getHpgrowth() {
		return hpgrowth;
	}
	public void setHpgrowth(int hpgrowth) {
		this.hpgrowth = hpgrowth;
	}
	public int getAtkgrowth() {
		return atkgrowth;
	}
	public void setAtkgrowth(int atkgrowth) {
		this.atkgrowth = atkgrowth;
	}
	public int getDefgrowth() {
		return defgrowth;
	}
	public void setDefgrowth(int defgrowth) {
		this.defgrowth = defgrowth;
	}
	public int getSpdgrowth() {
		return spdgrowth;
	}
	public void setSpdgrowth(int spdgrowth) {
		this.spdgrowth = spdgrowth;
	}
	public int getEvagrowth() {
		return evagrowth;
	}
	public void setEvagrowth(int evagrowth) {
		this.evagrowth = evagrowth;
	}
	
	
	
}
