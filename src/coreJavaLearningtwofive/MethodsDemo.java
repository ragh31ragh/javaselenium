package coreJavaLearningtwofive;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String namerd = d.getData();
		System.out.println(namerd);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
		
		getStaticData();
	}
	
	public String  getData() {
		 System.out.println("Hello world");
		 return "Raghavendra" ;
	}
	
	public static String  getStaticData() {
		 System.out.println("Hello staticworld");
		 return "Static Raghavendra" ;
	}

}
