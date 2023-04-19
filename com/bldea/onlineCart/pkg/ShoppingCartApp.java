package com.bldea.onlineCart.pkg;

import java.util.Scanner;



public class ShoppingCartApp
	{
	  public static void main(String[] args) throws Exception
	  {
		  System.out.println("Welcome to SS Shopping App");
		  System.out.println("Please sign in to the app");
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("What is your name?");
		  String name=sc.next();
		  System.out.println("What is your age?");
		  int age=sc.nextInt();
		  System.out.println("Enter your Phone Number?");
		  int phone=sc.nextInt(10);
		  System.out.println("Enter your Email?");
		  String email=sc.next();
		  
		  User c1= new User(name, age,phone,email);
		  System.out.println("Successfully Logged in "+c1.getName());
		  System.out.println("Available Categories:");
		  System.out.println("a: Electronics\n"
			 		+ "b: Cosmetics\n"
			 		+ "c: Dresses\n"
			 		+ "d: Accessories\n"
			 		+ "e: Footwears\n");
		  System.out.println("select your choice:");
		  String n=sc.next();
		  if(n.equalsIgnoreCase("a")==true) {
				 System.out.println("Search for Products");
				 boolean res1 = ShoppingCart.fetchProduct1(c1.getEmail());
				 
				  }
		  else if(n.equalsIgnoreCase("b")==true) {
				 System.out.println("Search for Products");
				 boolean res2 = ShoppingCart.fetchProduct2(c1.getEmail());
				 
	}

		  else if(n.equalsIgnoreCase("c")==true) {
				 System.out.println("Search for Products");
				 boolean res3 = ShoppingCart.fetchProduct3(c1.getEmail());
				 
		  }
		  else if(n.equalsIgnoreCase("d")==true) {
				 System.out.println("Search for Products");
				 boolean res4 = ShoppingCart.fetchProduct4(c1.getEmail());
				 
		  }
		  else {
				 System.out.println("Search for Products");
				 boolean res5 = ShoppingCart.fetchProduct5(c1.getEmail());
				 
		  }
		  
	  }
	}