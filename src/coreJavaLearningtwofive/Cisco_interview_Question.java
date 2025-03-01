package coreJavaLearningtwofive;
/*
 * Printing max number in min number column

Step 1 : Find minimum number
Step 2 : Identify column of min number
Step 3 : Find max number in identified column

 */
public class Cisco_interview_Question {
	/*
{{2,12,0},
{3,4,71},
7,1,9}}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{2,12,32},{3,45,71},{7,1,9}} ;
		//Assuming minimum number to be first element in Multi Dimensional array
		int min = abc[0][0] ;
		int mincolumn = 0  ;
		//Find and print the minimum number 
		for (int i = 0;i<3 ; i++) {
			for (int j = 0;j<3 ; j++) {
				if (abc[i][j] < min ) {
					min= abc[i][j];
					mincolumn = j ;
				}
			}
		}
		//extract the column id of minimum number 
		System.out.println(min);
		int k = 0 ;
		//iterate through the rows keeping column static 
		int maxnum = abc[0][mincolumn] ;
		while ( k < 3) {
			if (abc[k][mincolumn] > maxnum) {
				maxnum = abc[k][mincolumn];
			}
			k++;
			
		}
		System.out.println(maxnum);
	}

}
