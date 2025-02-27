package demoPack;

public class pyramid_exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 1 ;
		for (int i = 1; i <= 4; i++) {
			//int k = 1;
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k*3);
				System.out.print("\t");
				k++;
			}
			//k++;
			System.out.println("");
		}

	}
}
