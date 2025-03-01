package coreJavaLearningtwofive;

public class ThisKeywordDemo {
	
	int i = 2 ;
	
	public void getData() {
		int i = 3 ;
		System.out.println(i);
		System.out.println(this.i );
		int b = i + this.i ;
		System.out.println(b );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo td = new ThisKeywordDemo();
		td.getData();

	}

}
