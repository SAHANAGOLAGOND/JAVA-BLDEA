package Trainingcodes;


class Dog1 {

private String name;
private String color;
private int cost;
void setData(String name,String color,int cost) {
	this.name=name;
	this.color=color;
	this.cost=cost;
}
void getData() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(cost);
}
} 



public class test52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1= new Dog1();
		 d1.setData("blacky","black",5000);
		 d1.getData();

	}

}
