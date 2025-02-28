package oopsCoreJava;

public class ChildFunction extends ParentFunction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildFunction a = new ChildFunction();
		a.audio();
		
		

	}
	@Override
	public void audio() {
		System.out.println("This is child audio");
	}


}
