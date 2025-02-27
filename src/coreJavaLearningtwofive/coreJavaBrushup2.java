package coreJavaLearningtwofive;

import java.util.ArrayList;

public class coreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing numbers divisible by 2 
		int[] numbers = {2,5,4,2,46,42,33,31,64} ;
		for (int i=0 ; i < numbers.length ; i++) {
			if ( numbers[i] % 2 == 0 ) {
				System.out.println(numbers[i]);
			}
		}
		
		///break for loop if you find multiple of  2
		System.out.println("####Break example");
		for (int j = 0; j < numbers.length ; j++) {
			if (numbers[j] % 2 == 0 ) {
				System.out.println(numbers[j]);
				break ;
			}
		}
		System.out.println("####Printing in reverse order");
		for (int k = numbers.length -1 ; k >= 0 ; k--) {
			
				System.out.println(numbers[k]);
			
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rama");
		a.add("lakshmana");
		a.add("bharata");
		a.get(2);
		System.out.println(a.get(2));
	}

}
