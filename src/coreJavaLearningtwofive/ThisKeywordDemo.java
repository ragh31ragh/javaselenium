package coreJavaLearningtwofive;

public class ThisKeywordDemo {
	
	int i = 2 ;
	
	public void getData() {
		int i = 3 ;
		System.out.println(i);//3
		System.out.println(this.i );//2
		int b = i + this.i ;//5
		System.out.println(b );//5
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo td = new ThisKeywordDemo();
		td.getData();

	}

}
