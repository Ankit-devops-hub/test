package Assignment_3;


		public class NumberFormatExceptionexample{  
			  
		    private static final String inputString = "123.33";   
		      
		    public static void main(String[] args) {  
		        try {  
		                 int a = Integer.parseInt(inputString);  
		        }catch(NumberFormatException ex){  
		            System.err.println("Invalid string in argumment");  
		            //request for well-formatted string  
		        }  
		            }  

	}


