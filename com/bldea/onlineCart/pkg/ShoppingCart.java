package com.bldea.onlineCart.pkg;

import java.util.Scanner;
public class ShoppingCart{
	static String result;
	static String result1;
	static String result2;
	static String result3;
	private String Address;
static Scanner sc= new Scanner(System.in);

 @SuppressWarnings("unused")
public static boolean fetchProduct1(String name) throws Exception {
		System.out.println("1.Electronics");
		System.out.println("a) Smart Phones\n" + "b) Head Phones\n" + "c) Watchs\n"); 
			
		result = sc.next();
		
		if (result.equalsIgnoreCase("a")) { 
			System.out.println("a:Apple - 80000\n"
			 		+ "b: Redmi - 20000\n"
			 		+ "c: Samsung - 10000\n"
			 		+ "d: Oppo - 15000\n"
			 		+ "e: Vivo - 18000");
               result1 = sc.next();
		
               if (result1.equalsIgnoreCase("a")) {
            	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
            	   result2 = sc.next();
            	  
               
               if (result2.equalsIgnoreCase("a")) {
            	   System.out.println("Successfully Added to cart");
               }
               
               else if (result2.equalsIgnoreCase("b")){
            	   System.out.println("Enter your address?");
         		  String address=sc.next();
         		  System.out.println("Price:80000\n"+"Delivery charges: FREE\n" + "Total Amount:80000");
         		  System.out.println("Do you want to place the order:(type: YES/NO)");
         		  String result3=sc.next();
         		  if(result3.equalsIgnoreCase("yes")) {
         			  System.out.println("Ordered Placed");
         		  }
         		  else{
         			  System.out.println("Thanks for Your valuable time.Visit again!");
         		  }
         		  return true;
               }
               
               return false;
               }
 

 
               else if (result1.equalsIgnoreCase("b")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  

if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
	  String address=sc.next();
	  System.out.println("Price:20000\n"+"Delivery charges: FREE\n" + "Total Amount:20000");
	  System.out.println("Do you want to place the order:(type: YES/NO)");
	  result3=sc.next();
	  if(result3.equalsIgnoreCase("yes")) {
		  System.out.println("Ordered Placed");
	  }
	  else{
		  System.out.println("Thanks for Your valuable time.Visit again!");
	  }
	  return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:10000\n"+"Delivery charges: FREE\n" + "Total Amount:10000");
System.out.println("Do you want to place the order:(type: YES/NO)");
 result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
}
else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  

if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
	  String address=sc.next();
	  System.out.println("Price:15000\n"+"Delivery charges: FREE\n" + "Total Amount:15000");
	  System.out.println("Do you want to place the order:(type: YES/NO)");
	  result3=sc.next();
	  if(result3.equalsIgnoreCase("yes")) {
		  System.out.println("Ordered Placed");
	  }
	  else{
		  System.out.println("Thanks for Your valuable time.Visit again!");
	  }
	  return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  

if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
	  String address=sc.next();
	  System.out.println("Price:18000\n"+"Delivery charges: FREE\n" + "Total Amount:18000");
	  System.out.println("Do you want to place the order:(type: YES/NO)");
	  String result3=sc.next();
	  if(result3.equalsIgnoreCase("yes")) {
		  System.out.println("Ordered Placed");
	  }
	  else{
		  System.out.println("Thanks for Your valuable time.Visit again!");
	  }
	  return true;
}

return false;
}
}
//head phones

if (result.equalsIgnoreCase("b")) { 
	System.out.println("a:Boat - 2000\n"
	 		+ "b: Oramio - 2500\n"
	 		+ "c: Sony - 3000\n"
	 		+ "d: Hyper WH - 3500\n"
	 		+ "e: Beyerdyna - 4000");
       result1 = sc.next();
     if (result1.equalsIgnoreCase("a")) {
    	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
    	   result2 = sc.next();
    	  
       
       if (result2.equalsIgnoreCase("a")) {
    	   System.out.println("Successfully Added to cart");
       }
       
       else if (result2.equalsIgnoreCase("b")){
    	   System.out.println("Enter your address?");
 		  String address=sc.next();
 		  System.out.println("Price:2000\n"+"Delivery charges: FREE\n" + "Total Amount:2000");
 		  System.out.println("Do you want to place the order:(type: YES/NO)");
 		  String result3=sc.next();
 		  if(result3.equalsIgnoreCase("yes")) {
 			  System.out.println("Ordered Placed");
 		  }
 		  else{
 			  System.out.println("Thanks for Your valuable time.Visit again!");
 		  }
 		  return true;
       }
       
       return false;
       }
  else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:2500\n"+"Delivery charges: FREE\n" + "Total Amount:2500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:3000\n"+"Delivery charges: FREE\n" + "Total Amount:3000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:3500\n"+"Delivery charges: FREE\n" + "Total Amount:3500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:4000\n"+"Delivery charges: FREE\n" + "Total Amount:4000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
 }//watches
if (result.equalsIgnoreCase("c")) { 
	System.out.println("a:Fastrack - 2000\n"
	 		+ "b: Mansoon - 2500\n"
	 		+ "c: Sonata - 3000\n"
	 		+ "d: Taitan - 3500\n"
	 		+ "e: Timex - 4000");
       result1 = sc.next();
     if (result1.equalsIgnoreCase("a")) {
    	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
    	   result2 = sc.next();
    	  
       
       if (result2.equalsIgnoreCase("a")) {
    	   System.out.println("Successfully Added to cart");
       }
       
       else if (result2.equalsIgnoreCase("b")){
    	   System.out.println("Enter your address?");
 		  String address=sc.next();
 		  System.out.println("Price:2000\n"+"Delivery charges: FREE\n" + "Total Amount:2000");
 		  System.out.println("Do you want to place the order:(type: YES/NO)");
 		  String result3=sc.next();
 		  if(result3.equalsIgnoreCase("yes")) {
 			  System.out.println("Ordered Placed");
 		  }
 		  else{
 			  System.out.println("Thanks for Your valuable time.Visit again!");
 		  }
 		  return true;
       }
       
       return false;
       }
  else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:2500\n"+"Delivery charges: FREE\n" + "Total Amount:2500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:3000\n"+"Delivery charges: FREE\n" + "Total Amount:3000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:3500\n"+"Delivery charges: FREE\n" + "Total Amount:3500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:4000\n"+"Delivery charges: Free\n" + "Total Amount:4000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
 }
return false;
}

public static boolean fetchProduct2(String name) throws Exception {
	System.out.println("2.Cosmetics");
	System.out.println("a) Lipsticks\n" + "b) Compact\n" + "c) eye Shadows\n"); 
		
	result = sc.next();
	
	if (result.equalsIgnoreCase("a")) { 
		System.out.println("a:Mablin- 2999\n"
		 		+ "b: Nyka - 2500\n"
		 		+ "c: Sugar - 650\n"
		 		+ "d: Mamaearth - 1599\n"
		 		+ "e: My-Glam - 2000");
           result1 = sc.next();
	
           if (result1.equalsIgnoreCase("a")) {
        	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
        	   result2 = sc.next();
        	  
           
           if (result2.equalsIgnoreCase("a")) {
        	   System.out.println("Successfully Added to cart");
           }
           
           else if (result2.equalsIgnoreCase("b")){
        	   System.out.println("Enter your address?");
     		  String address=sc.next();
     		  System.out.println("Price:2999\n"+"Delivery charges: Free\n" + "Total Amount:2999");
     		  System.out.println("Do you want to place the order:(type: YES/NO)");
     		  String result3=sc.next();
     		  if(result3.equalsIgnoreCase("yes")) {
     			  System.out.println("Ordered Placed");
     		  }
     		  else{
     			  System.out.println("Thanks for Your valuable time.Visit again!");
     		  }
     		  return true;
           }
           
           return false;
           }



           else if (result1.equalsIgnoreCase("b")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:2500\n"+"Delivery charges: 100\n" + "Total Amount:2600");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:650\n"+"Delivery charges: FREE\n" + "Total Amount:650");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:1599\n"+"Delivery charges: FREE\n" + "Total Amount:1599");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:2000\n"+"Delivery charges: FREE\n" + "Total Amount:2000");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;
}
}
//Compact

if (result.equalsIgnoreCase("b")) { 
System.out.println("a:Mablin- 3999\n"
 		+ "b: Nyka - 1500\n"
 		+ "c: Sugar - 750\n"
 		+ "d: Mamaearth - 1599\n"
 		+ "e: My-Glam - 2000");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:3999\n"+"Delivery charges: FREE\n" + "Total Amount:3999");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1500\n"+"Delivery charges: 100\n" + "Total Amount:1600");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:750\n"+"Delivery charges: FREE\n" + "Total Amount:750");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1599\n"+"Delivery charges: FREE\n" + "Total Amount:1599");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:2000\n"+"Delivery charges: FREE\n" + "Total Amount:2000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}//eye Shadows
if (result.equalsIgnoreCase("c")) { 
System.out.println("a:Mablin- 1000\n"
 		+ "b: Nyka - 1500\n"
 		+ "c: Sugar - 699\n"
 		+ "d: Mamaearth - 1599\n"
 		+ "e: My-Glam - 300");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:1000\n"+"Delivery charges: 100\n" + "Total Amount:1100");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1500\n"+"Delivery charges: FREE\n" + "Total Amount:1500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:699\n"+"Delivery charges: FREE\n" + "Total Amount:699");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1599\n"+"Delivery charges: FREE\n" + "Total Amount:1599");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:300\n"+"Delivery charges: FREE\n" + "Total Amount:300");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}
return false;
}

//Dresses 
public static boolean fetchProduct3(String name) throws Exception {
	System.out.println("3.Dresses");
	System.out.println("a) Men\n" + "b) Women\n" + "c) Kids\n"); 
		
	result = sc.next();
	
	if (result.equalsIgnoreCase("a")) { 
		System.out.println("a:Trousers- 1999\n"
		 		+ "b: Formals - 2500\n"
		 		+ "c: Hoodies - 650\n"
		 		+ "d: Pyjamas - 1099\n"
		 		+ "e: Suits - 3000");
           result1 = sc.next();
	
           if (result1.equalsIgnoreCase("a")) {
        	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
        	   result2 = sc.next();
        	  
           
           if (result2.equalsIgnoreCase("a")) {
        	   System.out.println("Successfully Added to cart");
           }
           
           else if (result2.equalsIgnoreCase("b")){
        	   System.out.println("Enter your address?");
     		  String address=sc.next();
     		  System.out.println("Price:1999\n"+"Delivery charges: Free\n" + "Total Amount:1999");
     		  System.out.println("Do you want to place the order:(type: YES/NO)");
     		  String result3=sc.next();
     		  if(result3.equalsIgnoreCase("yes")) {
     			  System.out.println("Ordered Placed");
     		  }
     		  else{
     			  System.out.println("Thanks for Your valuable time.Visit again!");
     		  }
     		  return true;
           }
           
           return false;
           }



           else if (result1.equalsIgnoreCase("b")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:2500\n"+"Delivery charges: 100\n" + "Total Amount:2600");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();



if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:650\n"+"Delivery charges: FREE\n" + "Total Amount:650");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:1099\n"+"Delivery charges: FREE\n" + "Total Amount:1099");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:3000\n"+"Delivery charges: FREE\n" + "Total Amount:3000");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;
}
}
//Women

if (result.equalsIgnoreCase("b")) { 
System.out.println("a:Sarees- 5999\n"
 		+ "b: Kurtis- 2500\n"
 		+ "c: Selvars - 850\n"
 		+ "d: shorts- 1599\n"
 		+ "e: Lehengas - 5000");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:5999\n"+"Delivery charges: FREE\n" + "Total Amount:5999");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:2500\n"+"Delivery charges: 100\n" + "Total Amount:2600");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:850\n"+"Delivery charges: FREE\n" + "Total Amount:850");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1599\n"+"Delivery charges: FREE\n" + "Total Amount:1599");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:5000\n"+"Delivery charges: FREE\n" + "Total Amount:5000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}//Kids
if (result.equalsIgnoreCase("c")) { 
System.out.println("a:Night wears- 699\n"
 		+ "b: Sweaters - 1600\n"
 		+ "c: jeans- 899\n"
 		+ "d: Jackets - 1799\n"
 		+ "e: Romper suit - 5000");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:699\n"+"Delivery charges: 100\n" + "Total Amount:799");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1600\n"+"Delivery charges: FREE\n" + "Total Amount:1600");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:899\n"+"Delivery charges: FREE\n" + "Total Amount:899");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1799\n"+"Delivery charges: FREE\n" + "Total Amount:1799");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:5000\n"+"Delivery charges: FREE\n" + "Total Amount:5000");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}
return false;
}

public static boolean fetchProduct4(String name) throws Exception {
	System.out.println("4.Accessories");
	System.out.println("a) Men\n" + "b) Women\n" + "c) Kids\n"); 
		
	result = sc.next();
	
	if (result.equalsIgnoreCase("a")) { 
		System.out.println("a:Bracelet- 1499\n"
		 		+ "b: Lockets - 550\n"
		 		+ "c: Wallet - 650\n"
		 		+ "d: Glasses - 1099\n"
		 		+ "e: Rings - 3000");
           result1 = sc.next();
	
           if (result1.equalsIgnoreCase("a")) {
        	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
        	   result2 = sc.next();
        	  
           
           if (result2.equalsIgnoreCase("a")) {
        	   System.out.println("Successfully Added to cart");
           }
           
           else if (result2.equalsIgnoreCase("b")){
        	   System.out.println("Enter your address?");
     		  String address=sc.next();
     		  System.out.println("Price:1499\n"+"Delivery charges: Free\n" + "Total Amount:1499");
     		  System.out.println("Do you want to place the order:(type: YES/NO)");
     		  String result3=sc.next();
     		  if(result3.equalsIgnoreCase("yes")) {
     			  System.out.println("Ordered Placed");
     		  }
     		  else{
     			  System.out.println("Thanks for Your valuable time.Visit again!");
     		  }
     		  return true;
           }
           
           return false;
           }



           else if (result1.equalsIgnoreCase("b")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:550\n"+"Delivery charges: 50\n" + "Total Amount:600");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();



if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:650\n"+"Delivery charges: FREE\n" + "Total Amount:650");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:1099\n"+"Delivery charges: FREE\n" + "Total Amount:1099");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:3000\n"+"Delivery charges: FREE\n" + "Total Amount:3000");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;
}
}
//Women

if (result.equalsIgnoreCase("b")) { 
System.out.println("a:Jewells set- 999\n"
 		+ "b: Headband Pack- 250\n"
 		+ "c: Hairband - 85\n"
 		+ "d: handbags- 599\n"
 		+ "e: Sunglasses - 500");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:999\n"+"Delivery charges: FREE\n" + "Total Amount:999");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:250\n"+"Delivery charges: 100\n" + "Total Amount:350");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:85\n"+"Delivery charges: FREE\n" + "Total Amount:85");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:599\n"+"Delivery charges: FREE\n" + "Total Amount:599");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:500\n"+"Delivery charges: FREE\n" + "Total Amount:500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}//Kids
if (result.equalsIgnoreCase("c")) { 
System.out.println("a: Cool Hat- 199\n"
 		+ "b: Funky Sunglasses - 600\n"
 		+ "c: Belts- 299\n"
 		+ "d: Backpack- 799\n"
 		+ "e: Watches - 500");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:199\n"+"Delivery charges: 100\n" + "Total Amount:299");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:600\n"+"Delivery charges: FREE\n" + "Total Amount:600");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:299\n"+"Delivery charges: FREE\n" + "Total Amount:299");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:799\n"+"Delivery charges: FREE\n" + "Total Amount:799");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:500\n"+"Delivery charges: FREE\n" + "Total Amount:500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}
return false;
}

//FootWears
public static boolean fetchProduct5(String name) throws Exception {
	System.out.println("4.Accessories");
	System.out.println("a) Men\n" + "b) Women\n" + "c) Kids\n"); 
		
	result = sc.next();
	
	if (result.equalsIgnoreCase("a")) { 
		System.out.println("a:Sandals- 1949\n"
		 		+ "b: Shoes - 999.0\n"
		 		+ "c: Ope-Toe Sandals - 650\n"
		 		+ "d: Flip-flop - 1099\n"
		 		+ "e: Boots - 3000");
           result1 = sc.next();
	
           if (result1.equalsIgnoreCase("a")) {
        	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
        	   result2 = sc.next();
        	  
           
           if (result2.equalsIgnoreCase("a")) {
        	   System.out.println("Successfully Added to cart");
           }
           
           else if (result2.equalsIgnoreCase("b")){
        	   System.out.println("Enter your address?");
     		  String address=sc.next();
     		  System.out.println("Price:1949\n"+"Delivery charges: Free\n" + "Total Amount:1949");
     		  System.out.println("Do you want to place the order:(type: YES/NO)");
     		  String result3=sc.next();
     		  if(result3.equalsIgnoreCase("yes")) {
     			  System.out.println("Ordered Placed");
     		  }
     		  else{
     			  System.out.println("Thanks for Your valuable time.Visit again!");
     		  }
     		  return true;
           }
           
           return false;
           }



           else if (result1.equalsIgnoreCase("b")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:999.0\n"+"Delivery charges: 50\n" + "Total Amount:1049.0");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();



if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:650\n"+"Delivery charges: FREE\n" + "Total Amount:650");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
  System.out.println("Ordered Placed");
}
else{
  System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:1099\n"+"Delivery charges: FREE\n" + "Total Amount:1099");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
   System.out.println("a: Add to Cart\n"+"b: Buy Now");
   result2 = sc.next();
  

if (result2.equalsIgnoreCase("a")) {
   System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
   System.out.println("Enter your address?");
  String address=sc.next();
  System.out.println("Price:3000\n"+"Delivery charges: FREE\n" + "Total Amount:3000");
  System.out.println("Do you want to place the order:(type: YES/NO)");
  String result3=sc.next();
  if(result3.equalsIgnoreCase("yes")) {
	  System.out.println("Ordered Placed");
  }
  else{
	  System.out.println("Thanks for Your valuable time.Visit again!");
  }
  return true;
}

return false;
}
}
//Women

if (result.equalsIgnoreCase("b")) { 
System.out.println("a:Sandals- 999\n"
 		+ "b: Slippers- 250\n"
 		+ "c: Shoes - 899\n"
 		+ "d: Heels- 1599\n"
 		+ "e: flip-flop- 500");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:999\n"+"Delivery charges: FREE\n" + "Total Amount:999");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:250\n"+"Delivery charges: 40\n" + "Total Amount:290");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:899\n"+"Delivery charges: FREE\n" + "Total Amount:899");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:1599\n"+"Delivery charges: FREE\n" + "Total Amount:1599");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:500\n"+"Delivery charges: FREE\n" + "Total Amount:500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}//Kids
if (result.equalsIgnoreCase("c")) { 
System.out.println("a: Sandals- 899\n"
 		+ "b:Slippers - 600\n"
 		+ "c: Flip-flop- 299\n"
 		+ "d: Shoes- 799\n"
 		+ "e: Sneakers - 500");
   result1 = sc.next();
 if (result1.equalsIgnoreCase("a")) {
	   System.out.println("a: Add to Cart\n"+"b: Buy Now");
	   result2 = sc.next();
	  
   
   if (result2.equalsIgnoreCase("a")) {
	   System.out.println("Successfully Added to cart");
   }
   
   else if (result2.equalsIgnoreCase("b")){
	   System.out.println("Enter your address?");
		  String address=sc.next();
		  System.out.println("Price:899\n"+"Delivery charges: 100\n" + "Total Amount:999");
		  System.out.println("Do you want to place the order:(type: YES/NO)");
		  String result3=sc.next();
		  if(result3.equalsIgnoreCase("yes")) {
			  System.out.println("Ordered Placed");
		  }
		  else{
			  System.out.println("Thanks for Your valuable time.Visit again!");
		  }
		  return true;
   }
   
   return false;
   }
else if (result1.equalsIgnoreCase("b")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:600\n"+"Delivery charges: FREE\n" + "Total Amount:600");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("c")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:299\n"+"Delivery charges: FREE\n" + "Total Amount:299");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}

return false;

}
if (result1.equalsIgnoreCase("d")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:799\n"+"Delivery charges: FREE\n" + "Total Amount:799");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}
return false;

}
if (result1.equalsIgnoreCase("e")) {
System.out.println("a: Add to Cart\n"+"b: Buy Now");
result2 = sc.next();


if (result2.equalsIgnoreCase("a")) {
System.out.println("Successfully Added to cart");
}

else if (result2.equalsIgnoreCase("b")){
System.out.println("Enter your address?");
String address=sc.next();
System.out.println("Price:500\n"+"Delivery charges: FREE\n" + "Total Amount:500");
System.out.println("Do you want to place the order:(type: YES/NO)");
String result3=sc.next();
if(result3.equalsIgnoreCase("yes")) {
System.out.println("Ordered Placed");
}
else{
System.out.println("Thanks for Your valuable time.Visit again!");
}
return true;
}


}
return false;
}
return false;
}
}
