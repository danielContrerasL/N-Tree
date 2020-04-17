package entity;


public class GameObject<T> {

	private static int contId;
	private int id;
	private double weight;
	private T type;

	public GameObject(T type) {
		this.type = type;
		id = contId++;
		weight = 0.5;
	}

	public void updateWeight() {
		weight += 0.1;
	}

	public int getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}

	public T getType() {
		return type;
	}

}
