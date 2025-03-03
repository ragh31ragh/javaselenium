package coreJavaLearningtwofive;

import java.util.ArrayList;
public class ArrayListExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String>b = new ArrayList<String>();
		b.add("raghavendra");
		b.add("Java");
		b.add("python");
		System.out.println(b);
		b.add(0,"student");
		System.out.println(b);
		b.remove(1);
		System.out.println(b);
		b.get(1);
		System.out.println(b.contains("python"));
		b.indexOf("Java");
		
		
		

	}

}
