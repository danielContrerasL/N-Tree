package logic;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import constant.Gender;
import entity.Player;
import file.json.JSonManagger;

public class ManagerLogIn {
	
	private Player user;
	private String nickName;
	private String password;
	private JSonManagger jSonManagger;

	public ManagerLogIn() {
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(new Player(Gender.MALE, "Daniel", "Panda", "a123", true));
		list.add(new Player(Gender.MALE, "Daniel", "Panda", "1708" , false));
		list.add(new Player(Gender.MALE, "Camilo", "Xerces", "0609" , true));
		list.add(new Player(Gender.MALE, "Camilo", "Xerces", "0609" , false));
		jSonManagger = new JSonManagger();
		jSonManagger.writeAJson(list);
	}
	
	public void validateLogIn() {
		try {
			for (Player player : jSonManagger.readPesons()) {
				if (player.getNicName().equals(nickName)) {
					if (player.getPasword().equals(password)) {
						this.user = player;
						return;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void asingValues(String nickName, String password) {
		this.nickName = nickName;
		this.password = password;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Player getUser() {
		return user;
	}
	
	

}
