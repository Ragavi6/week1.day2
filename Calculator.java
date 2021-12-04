package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2) {
		
		return num1+num2;
	}
		
   public int sum (int num1,int num2) {
	   return num1-num2;
	   
   }
	   
	   public int mul (int num1,int num2) {
		   return num1*num2;
	  
		   
   }
   
	   public int divide (int num1,int num2) {
		   return num1/num2;
		   
	   }
   
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(20,30));
		
	System.out.println(calc.sum(20,30));
		
	System.out.println(calc.mul(20,30));
	
	System.out.println(calc.divide(20,30));	
	}



}




	
