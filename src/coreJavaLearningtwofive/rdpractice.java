package coreJavaLearningtwofive;

import java.util.ArrayList;

public class rdpractice {

	public static void main(String[] args) {
		int k = 1 ;
		for ( int i = 1 ; i <= 5 ;i ++) {
			//System.out.println("outerloop");
				for (int j = 1 ; j <= 5-i ; j++) {
					System.out.print(k);
					System.out.print("\t");
					k++;
				}
				System.out.println("");
				
			
		}


	}

}
/*1 2 3 4 
5 6 7 
8 9 
10 */