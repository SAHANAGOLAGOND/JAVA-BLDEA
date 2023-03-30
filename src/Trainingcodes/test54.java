package Trainingcodes;
class Dog3{

	private String name;
	private String color;
	private int cost;
	public Dog3() {
		
	}
	public Dog3(String name) {
		super();
		this.name = name;
	}
	public Dog3(String name,String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Dog3(String name, String color, int cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
}


public class test54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d1=new Dog3();
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println("---------------------------");

		Dog3 d2=new Dog3("Rocky");
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
		System.out.println("---------------------------");
		
		Dog3 d3=new Dog3("Tommy","white");
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getCost());
		System.out.println("---------------------------");
		
		Dog3 d4=new Dog3("Tommy","white",5000);
		System.out.println(d4.getName());
		System.out.println(d4.getColor());
		System.out.println(d4.getCost());
		System.out.println("---------------------------");

	}

}
