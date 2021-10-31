package test;

import java.util.Scanner;

public class perimeterOfTriangle {

	public static void main(String[] args) {
		// perimeter of triangle
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first side :");
		double side1=scanner.nextDouble();
		
		System.out.println("Enter Second side :");
		double side2=scanner.nextDouble();
		
		System.out.println("Enter Third side :");
		double side3=scanner.nextDouble();
		
		double perimeter=side1+side2+side3;
		System.out.println("Perimeter of Triangle :" +perimeter);
    
	}

}
