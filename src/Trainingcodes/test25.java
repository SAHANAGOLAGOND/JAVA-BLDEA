package Trainingcodes;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the string:");
String str1=sc.next();
str1=str1.toLowerCase();
for(int i=0;i<str1.length();i++) {
	if(str1.charAt(i)=='a' ||str1.charAt(i)=='e'|| str1.charAt(i)=='i' ||str1.charAt(i)=='o' || str1.charAt(i)=='u') {
		System.out.print("@");
	}

else {
	
	System.out.print(str1.charAt(i));
}
}


	}



	}


