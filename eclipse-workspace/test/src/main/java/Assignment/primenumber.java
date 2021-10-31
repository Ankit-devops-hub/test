package Assignment;

import java.util.Scanner;

public class primenumber {
     public static void main(String[]args) {
		int i=0;
		int counter=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scanner.nextInt();
		boolean b=false;
		
		while(counter<num) {
			if(num%counter==0) {
				b=true;
				break;
			}
			if(b=true) {
				System.out.println("Given number "+num+"is not a prime number");
			}
			else {
				System.out.println("Given number "+num+"is a prime number");
			}
			}
				
		}
	}

