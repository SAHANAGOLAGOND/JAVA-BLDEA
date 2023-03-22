package Trainingcodes;

import java.util.Scanner;

public class Arraycode1 {

	public static void main(String[] args) {
		System.out.println("enter the count og students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the marks of student number"+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("the marks of student number"+(i+1+" is:"+arr[i]));
		}
	}

		// TODO Auto-generated method stub

	}


