package Assignment;

import java.util.Scanner;

//fibonacci series using for loop
/*public class fibonacci {

	public static void main(String[] args) {
		
		
		int firstTerm=0;
		int secondTerm=1;
        
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        
        System.out.println("Fibonacci Series till " + count + " terms:");
        
        for(int i=1;i<=count;++i) {
        System.out.println(firstTerm +",");
		int sum=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=sum;
		
        }
	}
	}*/

//fibonacci series using for loop

public class fibonacci{
	public static void main(String[]args) {
		int firstterm=0;
		int secondterm=1;
		
		System.out.println("Enetr the count for series :");
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		int i=1;
		while(i<=count) {
			System.out.println(firstterm+", ");
			int sum=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=sum;
			i++;
		}
	}
}
