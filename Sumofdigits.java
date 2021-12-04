package week1.day2;

public class Sumofdigits {

	public static void main(String[] args) {
		
    int input = 123; //1+2+3 = 6
    
    int sum =0;
    
    int rem;
    
    while (input > 0) {
	 
	 rem = input % 10;// 123 % 10= 3
	 //0+3=3
	 sum=sum +rem;
	 //123 = 2
	 
	 input=input/10; // 123/ 10=12
	 
 }
  System.out.println(sum);
	}

	

}
