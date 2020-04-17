package test;

import java.util.ArrayList;

import constant.Gender;
import entity.Player;
import file.json.JSonManagger;

public class TestFileJson {

	private Player player;
	private JSonManagger jSonManagger;
	private ArrayList<Player> list;

	public TestFileJson() {
		list = new ArrayList<Player>();
		player = new Player(Gender.MALE, "Daniel", "Panda", "a123", true);
		list.add(player);
		player = new Player(Gender.MALE, "Daniel", "Panda", "1708" , false);
		list.add(player);
		player = new Player(Gender.MALE, "Camilo", "Xerces", "0609" , true);
		list.add(player);
		player = new Player(Gender.MALE, "Camilo", "Xerces", "0609" , false);
		list.add(player);
		jSonManagger = new JSonManagger();
	}

	public void test() {
		jSonManagger.writeAJson(list);
	}

	public void print() {
		for (Player player : list) {
			System.out.println(player.getName());
		}

	}

	public static void main(String[] args) {
		TestFileJson t = new TestFileJson();
		t.test();
		t.print();;
	}

}
