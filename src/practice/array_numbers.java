package practice;

import java.util.ArrayList;

public class array_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,5,5,4,6,6,9,12,14,14,14,34,34,4,8};
		ArrayList<Integer> al = new ArrayList<Integer>();
		//get the first number
		//compare with next numbers
		//If equals increment counter by 1
		//if counter equals one print it as unique number
		for(int i = 0 ; i < a.length ; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i+1;j < a.length ; j++ ) {
					if (a[i]==a[j]) {
						k++ ;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if ( k ==1 ) {
					System.out.println("Unique Number");
				}
				
			}
			
		}

	}

}
