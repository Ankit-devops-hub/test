package Assignment_2;

import java.util.Scanner;

public class sumOfNumber {

	public static void main(String[] args) {
		int total=0;
        
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		int Number=num.nextInt();
		
		while(Number>0) {
			int Num=Number%10;
			total=total+Num;
			Number=Number/10;
			
		}
		System.out.println("Sum of the digits :"+total);
	}

}
