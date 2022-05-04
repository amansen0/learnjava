package com.java;
import java.util.*;

public class shapes {public static void main(String[]args) {
	Scanner A = new Scanner(System.in);
//	while(true) {
//	System.out.println("radius of the circle");
//	double r = A.nextDouble();
//	double Area = 22*r*r/7;
//	System.out.println("area of the circle = "+ Area);
//	}
	// 3rd 
	
	
	
//	while(true) {
//	System.out.println("enter");
//	double t = A.nextDouble();
//	System.out.println(t*1);
//	System.out.println(t*2);
//	System.out.println(t*3);
//	System.out.println(t*4);
//	System.out.println(t*5);
//	System.out.println(t*6);
//	
//	System.out.println(t*7);
//	System.out.println(t*8);
//	System.out.println(t*9);
//	System.out.println(t*10);
//	}
	//4th
	
	while(true) {
	System.out.println("enter the first number");
	double a =A.nextDouble();
	
	System.out.println("press 1 for +, 2 for -,3 for *,4 for /,5 for %");
	int oparator = A.nextInt();
	
	System.out.println("enter the second number");
	double b = A.nextDouble();
	
	switch(oparator) {
	
	case 1:
	  double addition = a + b;
		System.out.println(addition);
		break;
	case 2:
		double subtraction = a-b;
		System.out.println(subtraction);
		break;
	case 3:
		double multiplication = a*b;
		System.out.println(multiplication);
		break;
	case 4:
		double division = a /b;
		System.out.println(division);
		break;
	case 5 :
		double modulas = a%b;
		System.out.println(modulas);
		break;
		default:
			System.out.println("INVALID INPUT");
	}
		
	}
	//5th
	
	
	
	
	}

}
