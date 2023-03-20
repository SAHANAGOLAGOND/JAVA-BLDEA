package Trainingcodes;
import java.util.Scanner;
public class test4 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values of n");
	int n=sc.nextInt();
	int count=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println();
	}
}
}