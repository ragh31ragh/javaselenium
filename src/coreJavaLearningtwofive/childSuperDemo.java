package coreJavaLearningtwofive;

public class childSuperDemo extends ParentSuperDemo {
	String name = "QA click";
	
	public childSuperDemo(){
		super();
		System.out.println("child class constructor");
	}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
		//QA click
		//paul
		//150
		//next50
		//250
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childSuperDemo cd = new childSuperDemo();
		cd.getStringData();
		cd.getData();
		

	}
	
	public void getData() {
		super.getData();
		System.out.println("I am from child class");
		//I am from parent class
		//I am from child class 
	}

}
