package Assignment_2;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int[] numbers=new int[] {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		System.out.println("Duplicate numbers are :");
		
		for(int i=0 ;i<numbers.length ;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println("Duplicate found :"+numbers[i]);
				}
			}
			
		}

	}

}
