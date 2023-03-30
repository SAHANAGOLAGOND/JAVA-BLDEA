package Trainingcodes;
class Tiger {

private String name;
private String color;
private int cost;
private String country;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}
}


public class test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1= new Tiger();
		 t1.setName("ramu");
		 t1.setColor("orange");
		 t1.setCost(5);
		 t1.setCountry("india");
		 System.out.println(t1.getName());
		 System.out.println(t1.getColor());
		 System.out.println(t1.getCost());
		 System.out.println(t1.getCountry());

	}

}
