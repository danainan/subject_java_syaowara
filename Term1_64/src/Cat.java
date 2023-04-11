
public class Cat {
	private String breed;
	private int age;
	private String color;
	private String name;
	private double weight;
	
	public Cat() {
		
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
	//Russian Blue, Age 2 yr, Color Grey, Name Chacha, Weight 1.5 kgs
		String s = "";
		s += this.breed + ", " + " Age " + this.age + " yr, Color " + this.color + ", Name " + this.name + ", Weight " + this.weight + " kgs";
		return s;
	}
}
