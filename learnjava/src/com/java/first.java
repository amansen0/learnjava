package com.java;
import java.util.*;


public class first {public static void main(String[]args) {
	
	System.out.println("Enter two numbers");
	
	Scanner sr =  new Scanner(System.in);
	

	while (true)
	{ 
		
		double num1;
		System.out.println("enter first number");
	    num1 = sr.nextDouble();
	    System.out.println("Select Oparator:");
	    double num2;
	    String ch = sr.next();
		System.out.println("enter second number");
		num2 = sr.nextDouble();
		
	    
	    
	
		
		
		if(ch.equals("+"))
		{
	
			
			System.out.println( num1+num2);
		}
		else if (ch.equals("*"))
		{
			System.out.println(num1*num2);
			
		}
		else if (ch.equals("-"))
		{
			System.out.println(num1-num2);
			
		}
		else if (ch.equals("/"))
		{
			System.out.println(num1/num2);
		}
		else if (ch.equals("%"))
		{
			System.out.println(num1%num2);
		}
		
				
			
	
	}

	
	
}


}
