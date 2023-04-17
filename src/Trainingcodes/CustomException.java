package Trainingcodes;
import java.util.Scanner;

class UnderAgeException extends Exception{
	public  String getMessage(){
		return"Your are still a kid.Please grow up";
}
	}
class OverAgeException extends Exception{
	public  String getMessage(){
			return"Please control your emotions. You are a senior citizen.";
		}
	}
class Candidate{
	int age;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age= sc.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException{
		if(age<21) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>21) {
			OverAgeException uae=new OverAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else {
			System.out.println("Eligible for Marriage");
		}
	}
}
public class CustomException {
	public static void main(String[] args) {
		try {
			Candidate c1=new Candidate();
			c1.collectData();
			c1.verify();
		}
		catch(OverAgeException|UnderAgeException e) {
			System.out.println("Exception handled in main");
		}
	}

}

