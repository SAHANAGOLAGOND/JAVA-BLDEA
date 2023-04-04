package Trainingcodes;

import java.util.Arrays;
import java.util.Scanner;

public class Stringcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("String-1:");
		String s1=sc.next();
		System.out.println("string-2");
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("not anagram");
		}
		
		
		
		
		



		

	}

}
