package Assignment;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year:");
		double year=scanner.nextDouble();
		
		if((year%4==0) && (year%100!=0)||(year%400==0))
			System.out.println(year +" is a leap year");
		else 
			System.out.println(year +"is not leap year");
		
		
		}

}
