package Assignment_3;

public class arrayToString {
       public static String toString(char[] a)
	    {
	        // Creating an object of String class
	        String string = String.valueOf(a);
	 
	        return string;
	    }
	 
	    // Method 2
	    // Main driver method
	    public static void main(String args[])
	    {
	     
	        // Custom input character array
	        char s[] = { 'g', 'e', 'e', 'k',
	                     's', 'f', 'o', 'r',
	                     'g', 'e', 'e', 'k', 's' };
	 
	        // Print the corresponding string to
	        // character array 
	        System.out.println(toString(s));
	    }
	

	}

