package entity;

import constant.GameClass;
import constant.Gender;

public class Player {

	private Gender gender;
	private String name;
	private String nicName;
	private String Pasword;
	private GameClass playerClass;
	private boolean superUser;


	public Player(Gender gender, String name, String nicName, String pasword, boolean superUser) {
		this.gender = gender;
		this.name = name;
		this.nicName = nicName;
		Pasword = pasword;
		this.superUser = superUser;
		this.playerClass = GameClass.VOID;
	}

	public Player() {
	}

	public Gender getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getNicName() {
		return nicName;
	}

	public String getPasword() {
		return Pasword;
	}

	public GameClass getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(GameClass playerClass) {
		this.playerClass = playerClass;
	}

	public boolean isSuperUser() {
		return superUser;
	}

	public void setSuperUser(boolean superUser) {
		this.superUser = superUser;
	}
	
	


}
