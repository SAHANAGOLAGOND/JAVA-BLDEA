package Trainingcodes;

import java.util.Scanner;

public class Arraycode2 {

	public static void main(String[] args) {
		System.out.println("enter count of classes:");
		Scanner sc=new Scanner(System.in);
		int cls=sc.nextInt();
		System.out.println("enter the count of students in each class:");
		int stu=sc.nextInt();
		int arr[][]=new int[cls][stu] ;
		for(int i=0;i<cls;i++) {
			System.out.println("inside the class"+ (i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------");
		for(int i=0;i<cls;i++) {
			System.out.println("inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("the marks of student"+(j+1)+"is:"+arr[i][j]);
			}
		}

		
		
	}

}
