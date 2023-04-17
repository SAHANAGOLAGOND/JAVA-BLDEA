package Trainingcodes;
import java.util.Scanner;


class Addition extends Thread{
	@Override
	public void run() {
		System.out.println("addition operation");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
		System.out.println("addition completed");
	}
}
class Printing extends Thread{
	@Override
public void run() {
		System.out.println("printing operation");
	
for(int i=1;i<=5;i++) {
	try {
		System.out.println("RCB FOREVER");
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
System.out.println("Printing completed");
	}
	}
		class Banking extends Thread{
			@Override
			public void run() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Banking operation");
				System.out.println("Enter the accno:");
				int accno=sc.nextInt();
				System.out.println("Enter pin");
				int pin=sc.nextInt();
				System.out.println("printing completed");

			}
		}
		public class Threadexp3 {  
		public static void main(String[] args) {
			System.out.println("main Starting");
			Addition ad= new Addition();
			System.out.println(ad);
			Printing pr=new Printing();
			System.out.println(pr);
			Banking bn=new Banking();
			System.out.println(bn);
			Thread t1=new Thread(ad);
			Thread t2=new Thread(pr);
			Thread t3=new Thread(bn);
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main terminated");
		}

	}
