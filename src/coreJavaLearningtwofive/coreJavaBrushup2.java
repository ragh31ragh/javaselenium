package coreJavaLearningtwofive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		a.add("selenium");
		System.out.println(a.contains("selenium"));
		a.get(2);
		System.out.println(a.get(2));
		
		System.out.println("####Array List for Loop ");
		for ( int i =0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("####Enhanced for Loop ");
		for(String val:a) {
			System.out.println(val);
			
		}
		System.out.println("####Array List Boolean value  ");
		String[] names = { "rama","paul","nick"};
		List<String> names_array= Arrays.asList(names);
		Boolean boolean_value = names_array.contains("paul");
		System.out.println(boolean_value);		
		
	}

}
