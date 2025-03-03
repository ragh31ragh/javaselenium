package coreJavaLearningtwofive;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		//System.out.println(hs);
		hs.add("UKD");
		//System.out.println(hs);
		hs.add("Aus");
		Iterator<String> it= hs.iterator();
		//System.out.println(it.next());
		//System.out.println(it.next());
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
