package Assignment_3;

public class arithmeticExceptionExample {

	
		public void method1() throws ArithmeticException{  
			throw new ArithmeticException("Calculation error"); 
		   }  
		   void method2() throws ArithmeticException{  
			method1();  
		   }  
		   void method3(){  
			try{  
			   method2();  
			}
			catch(ArithmeticException e){
			   System.out.println("ArithmeticException handled");
			}  
		   }  
		   public static void main(String args[]){  
			arithmeticExceptionExample obj=new arithmeticExceptionExample();  
			obj.method3();  
			System.out.println("End Of Program");  
		   }  

	}


