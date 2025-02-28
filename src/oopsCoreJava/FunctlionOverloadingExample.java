package oopsCoreJava;

public class FunctlionOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctlionOverloadingExample a = new FunctlionOverloadingExample();
		a.getData(5);
		a.getData(4, 5);
	}
	
	public void getData(int a) {
		System.out.println(a);
		
	}
	
	public void getData(int a ,int b) {
		System.out.println(a);
		System.out.println(b);
		
	}

}
