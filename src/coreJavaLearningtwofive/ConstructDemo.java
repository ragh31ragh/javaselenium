package coreJavaLearningtwofive;

public class ConstructDemo {
	
	public ConstructDemo() {
		System.out.println("I am in constuctor ");
	}
	
	public ConstructDemo(int a, int b) {
		System.out.println("I am in parameterized constuctor ");
	}
	
	public ConstructDemo(String str) {
		System.out.println(str);
	}
	public void getData() {
		System.out.println("get data method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo cd = new ConstructDemo();
		ConstructDemo cd2 = new ConstructDemo(4,5);
		ConstructDemo cd3 = new ConstructDemo("hello");
		cd.getData();

	}

}
