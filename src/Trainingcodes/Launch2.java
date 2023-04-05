package Trainingcodes;


class cat{
	String name;
	int cost;
	String breed;
	cat(){      //constructor
		this("tommy");
		System.out.println("inside cons-1");
	}
	cat(String name){
		this("rocky",5000);
		System.out.println("Inside cons-2");
	}
	cat(String name,int cost){
		this("snoofy",8000,"GR");
		System.out.println("Inside cons-3");
	}
	cat(String name,int cost,String breed){
		super();
		System.out.println("Inside cons-4");
	}
}

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1=new cat();


	}

}
