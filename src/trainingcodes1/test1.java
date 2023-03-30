package trainingcodes1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = sc.next();
		int length = s1.length();
		//int arr[] = new int[s1.length()];
		
		for(int i=0; i<s1.length();i++) {
			int count = 0;
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			System.out.println("The occurance of character "+s1.charAt(i)+" is: "+count );
		}
	}

}
