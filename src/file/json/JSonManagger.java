package file.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import constant.Constant;
import entity.Player;

public class JSonManagger {

	private Gson gson;

	public JSonManagger() {
		gson = new Gson();
	}

	private String arrayToJson(ArrayList<Player> listPerson) {
		return gson.toJson(listPerson);
	}

	public void writeAJson(ArrayList<Player> listPerson) {
		try {
			// FileWriter file = new
			// FileWriter("C:/Users/Pandaman/Documents/java/Json/test.json");getClass().getClassLoader().getResource("FoodItemData.json")
			FileWriter file = new FileWriter(Constant.PATH_JSON_FILE);//C:\Users\willianl\Documents\programacion_lll\N-Tree\src\file
//			FileWriter file = new FileWriter(getClass().getClassLoader().getResource("/file/players.json").toString());//"E:/uptc/programacion_lll/N-Tree/src/file/players.json");
			
			file.write(arrayToJson(listPerson));
			file.close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.toString());
		}
	}
	
	
	
	public ArrayList<Player> readPesons() throws IOException, ParseException {
		ArrayList<Player> listPerson = new ArrayList<Player>();
		JsonParser parser = new JsonParser();
		FileReader fr = new FileReader(Constant.PATH_JSON_FILE);
		JsonElement datos = parser.parse(fr);
		JsonArray array = datos.getAsJsonArray();
		java.util.Iterator<JsonElement> iter = array.iterator();
		while (iter.hasNext()) {
			JsonElement entrada = iter.next();
			Gson gson = new Gson();
			Player p = new Player();
			p = gson.fromJson(entrada, Player.class);
			listPerson.add(p);
		}
		fr.close();
		return listPerson; 
	}

//	public MyLinkedList<Player> readPesons() throws IOException, ParseException {
//		MyLinkedList<Player> listPerson = new MyLinkedList<Player>();
//		JsonParser parser = new JsonParser();
////		FileReader fr = new FileReader(getClass().getResource("/file/players.json").toString());
//		FileReader fr = new FileReader("E:/uptc/programacion_lll/N-Tree/src/file/players.json");
//		JsonElement datos = parser.parse(fr);
////		JsonElement array = datos.getAsJson;
//		for (JsonElement ele : datos.getAsJsonArray()) {
//			Player p = new Player();
//			p = gson.fromJson(ele, Player.class);
//			listPerson.add(p);
//		}
////		java.util.Iterator<JsonElement> iter = array.getAsInt();
////		while (iter.hasNext()) {
////			JsonElement entrada = iter.next();
////			Gson gson = new Gson();
////			Player p = new Player();
////			p = gson.fromJson(entrada, Player.class);
////			listPerson.add(p);
////		}
//		return listPerson;
//	}
	
	
//	public MyLinkedList<Player> readPesons() throws IOException, ParseException {
//		MyLinkedList<Player> listPerson = new MyLinkedList<Player>();
//		JsonParser parser = new JsonParser();
//		FileReader fr = new FileReader("E:/uptc/programacion_lll/N-Tree/src/file/players.json");
//		JsonElement datos = parser.parse(fr);
//		JsonArray array = datos.getAsJsonArray();
//		java.util.Iterator<JsonElement> iter = array.iterator();
//		while (iter.hasNext()) {
//			JsonElement entrada = iter.next();
//			Gson gson = new Gson();
//			Player p = new Player();
//			p = gson.fromJson(entrada, Player.class);
//			listPerson.add(p);
//		}
//		return listPerson; 
//	}
	
//	public MyLinkedList<Player> readPesons() throws IOException, ParseException {
//		MyLinkedList<Player> listPerson = new MyLinkedList<Player>();
//		JsonParser parser = new JsonParser();
//		FileReader fr = new FileReader("E:/uptc/programacion_lll/N-Tree/src/file/players.json");
//		JsonReader jsonReader = new JsonReader(fr);
//		Gson gson = new Gson();
////	    JsonArray Jarray = parser.parse(jsonReader).getAsJsonArray();
//	    JsonArray Jarray = (JsonArray) parser.parse(jsonReader).getAsJsonObject().get("Player");
//		
//	    System.out.println(Jarray);
//	    for (JsonElement obj : Jarray) {
//	        Player player = gson.fromJson(obj, Player.class);
//	        listPerson.add(player);
//	    }
//		
//		
////		JsonElement datos = parser.parse(fr);
////		JsonArray array = datos.getAsJsonArray();
////		java.util.Iterator<JsonElement> iter = array.iterator();
////		while (iter.hasNext()) {
////			JsonElement entrada = iter.next();
////			Gson gson = new Gson();
////			Player p = new Player();
////			p = gson.fromJson(entrada, Player.class);
////			listPerson.add(p);
////		}
//		return listPerson; 
//	}
	
	
//	URL url = getClass().getClassLoader().getResource("FoodItemData.json");
//
//    FileReader fileReader = null;
//    try {
//        fileReader = new FileReader(url.getPath());
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    }
//    JsonReader jsonReader = new JsonReader(fileReader);
//    Gson gson = new Gson();
//    JsonParser parser = new JsonParser();
//    JsonArray Jarray = parser.parse(jsonReader).getAsJsonArray();
//
//    List<FoodItem> listOfFoodItems = new ArrayList<FoodItem>();
//
//    for (JsonElement obj : Jarray) {
//        FoodItem foodItem = gson.fromJson(obj, FoodItem.class);
//        listOfFoodItems.add(foodItem);
//    }

}
