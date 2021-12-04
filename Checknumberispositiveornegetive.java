package week1.day2;

public class Checknumberispositiveornegetive {
	
	public void validatenum (int num) {
     
		if (num <0) {
			
		System.out.println("The number is negative");
		}
		else if (num > 0) {
				
		System.out.println("The number is positive");	
			}
		
		else {
			
		}
		System.out.println("The number is neither negative or postive");
		
			}
		
		public static void main(String[] args) {
			
	    int num = (35);
			
		Checknumberispositiveornegetive identify = new Checknumberispositiveornegetive();	
		
		identify.validatenum(num);
				
		}	

}
