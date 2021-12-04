package week1.day2;

import java.util.Arrays;

public class Missingnuminarray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,8};
		
		int len = array.length;
		
		Arrays.sort(array);	
		
		for (int i=1;i<=len; i++){
			
			if (i!=array [i-1]) {
				
				System.out.println(i);
			}
		}

	}

}
