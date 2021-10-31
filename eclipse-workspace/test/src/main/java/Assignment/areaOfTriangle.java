package Assignment;

import java.util.Scanner;

public class areaOfTriangle{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the hight :");
		double hight=scanner.nextDouble();
		
		System.out.println("Enter the base :");
		double base=scanner.nextDouble();
		
        double area=(hight*base)/2;
        
        System.out.println(area);

	}

}
