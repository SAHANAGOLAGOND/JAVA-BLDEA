package Trainingcodes;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("your are still minor please growup");
		}
		else if(age>65) {
			System.out.println("you are senior citizen");
		}
		else {
			System.out.println("congratulations");
		}

	}

		// TODO Auto-generated method stub

	}

