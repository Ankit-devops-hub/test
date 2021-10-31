package Assignment_3;

public class stringToCharacter {

	public static void main(String[] args) {
		String str="Java Assignment by Ankit Pathak";
		
		//Creating array of string length
		 char[] ch= new char[str.length()];
		 
		 //Copying element in array
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			
		//Printing 
			for(char c:ch) {
				System.out.println(c);
			}
		}

	}

}
