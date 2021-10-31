package Assignment_2;

import java.util.Scanner;

public class reverseNumbers {

	public static void main(String[] args) {
		//int number=1234;
		int reverseNum=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
		
		while(number!=0) {
			reverseNum=reverseNum*10;
			reverseNum=reverseNum+number%10;
			number=number/10;
		}
		System.out.println("Reverse of a Number is :"+reverseNum);

	}

}
