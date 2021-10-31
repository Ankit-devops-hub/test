package Assignment_2;

import java.util.Scanner;

public class averageOfNumbersUsingArray {

	public static void main(String[] args) {
		// declare array
		
		int arr[]=new int[] {1,2,3,4,5};
		
		//Calculate total
		int Total=0;
		for(int i=0;i<arr.length;i++) {
			Total=Total+arr[i];
			
			}
		//Find Average
		int avarage=Total/arr.length;
		//Print
		System.out.println("Average of number is :" +avarage);
        
	}

}
