package Trainingcodes;


class Dog {

	private String name;
private String color;
private int cost;
void setData(String a,String b,int c) {
	name=a;
	color=b;
	cost=c;
}
void getData() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(cost);
}
} 
public class test50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		d1.setData("blacky","black",5000);
		d1.getData();

	}

}
