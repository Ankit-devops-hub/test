package Assignment;

import java.util.Scanner;

public class  factorial{
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=scanner.nextInt();
		int n=1;
		long fact=1;
		while (n<=num) 
		{
			fact=fact * n;
            n++;
            
		};
		System.out.println("Factorial of Number:" +fact);
	}
}
