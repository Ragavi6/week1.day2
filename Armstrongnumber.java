package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
		int input = 153; //(1*1*1)+(5*5*5)+(3*3*3)=153
	    int sum =0;
	    int orgnum = input;
	    while (input > 0) {
	           int rem = input % 10;
		
		       sum=sum +(rem*rem*rem);
		        input=input/10; 
		 }
	    
	    if(orgnum == sum) {
	     System.out.println("given number is an armstrong number");
	    }
	    else{
	     System.out.println("is not a armstrong number");
	    	
	    	
	    }
	    }
		

}

