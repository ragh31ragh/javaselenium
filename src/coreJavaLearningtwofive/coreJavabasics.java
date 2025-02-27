//lecture 20 : About java data types 
//lecture 21 : What are arrays in java ? How to initialize and retrieve the values of array 

package coreJavaLearningtwofive;

public class coreJavabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5 ;
		String website = "raghavendra test" ;
		char letter = 'r';
		double dec = 5.99 ;
		boolean mycard = true ;
		
		System.out.println(num);
		System.out.println(num + " My num is stored in num variable");
		
		//arrays
		int[] intarray = new int[5];
		int[] arr2 = {3,4,5,6,7};
		intarray[0] = 1;
		intarray[2] = 1;
		intarray[3] = 1;
		intarray[3] = 2;
		intarray[4] = 1;
		//intarray[5] = 1;
		System.out.println(intarray[2]);
		System.out.println(arr2[2]);
		
		

	}

}
