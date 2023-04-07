package Trainingcodes;

class Plane {
	void takeoff() {
		System.out.println("plane took off");
	
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane landed");
	}
}
class cargoplane extends Plane{
	void fly() {
		System.out.println("cargo flying at low height");
	}
	void carryGoods() {
		System.out.println("cargo plane carry goods");
	}
	}
class fighterPlane extends Plane{
	void fly() {
		System.out.println("fighter plane flying at great height");
		
	}
	void carryWeapons() {
		System.out.println("fighter plane carry weapons");
	}
	}
class passengerPlane extends Plane{
	void fly() {
		System.out.println("passenger plane flying at medium heights");
	}
	void carryPassenger() {
		System.out.println("passenger plane carry passenger");
	}
}

public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane cp=new cargoplane();
		fighterPlane fp=new fighterPlane();
		passengerPlane pp=new passengerPlane();
		cp.takeoff();
		cp.fly();
		cp.carryGoods();
		System.out.println("------------------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("--------------------------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		
	}

}

	
