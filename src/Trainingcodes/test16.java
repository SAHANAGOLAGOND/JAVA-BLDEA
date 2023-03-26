package Trainingcodes;

import java.util.Arrays;

public class test16 {

	public static void main(String[] args) {
		int arr1[]= {10,30,25,68,40,15,90,78,144,71,54,8};
		int arr2[]= {90,78,10,30,25,144,71,54,8,68,40,888};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr2.length) {
			for (int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays not equal");
					System.exit(0);
				}
			}
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays not qual");
		}
		
	}


		// TODO Auto-generated method stub

	}
