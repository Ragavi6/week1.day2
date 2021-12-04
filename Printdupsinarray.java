package week1.day2;

public class Printdupsinarray {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len = array.length;
		int count =0;
		System.out.println("The duplicate numbes in this array as follows:-");
		
		for(int i=0;i<len;i++) {
			
		for( int j=0;j<len;j++) {	
		    	
		    if (array[i]== array[j]) {
		    	count = count +1;
		    	System.out.println(array[i]);
		    }

	}

}
	}
}
