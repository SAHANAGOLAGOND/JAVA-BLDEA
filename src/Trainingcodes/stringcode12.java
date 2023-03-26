package Trainingcodes;

import java.util.Scanner;

public class stringcode12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String Str1=sc.next();
		String Str2="";
		for(int i=Str1.length()-1;i>=0;i--) {
			Str2=Str2+Str1.charAt(i);

		}
		if(Str1.equals(Str2)==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}




	}


