package coreJavaLearningtwofive;

public class Cisco_interview_Question {
	/*
{{2,12,0},
{3,4,71},
7,1,9}}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{2,12,0},{3,4,71},{7,1,9}} ;
		int min = abc[0][0] ;
		int mincolumn = 0  ;
		for (int i = 0;i<3 ; i++) {
			for (int j = 0;j<3 ; j++) {
				if (abc[i][j] < min ) {
					min= abc[i][j];
					mincolumn = j ;
				}
			}
		}
		System.out.println(min);
		int k = 0 ;
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
