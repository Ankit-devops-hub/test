package Assignment_3;

import java.util.Scanner;

public class ChkPalindrome {

	public static void main(String[] args) {
		
		String rev="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		int Len=str.length();
        
		for(int i=Len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrom");
		}else {
			System.out.println("Given string is not palindrom");
		}
		

	}

}
