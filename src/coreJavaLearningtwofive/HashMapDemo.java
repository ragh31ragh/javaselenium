package coreJavaLearningtwofive;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		hm.put(0, "hello");
		hm.put(1, "good morning");
		hm.put(2, "monday");
		//hm.get(2)
		System.out.println(hm.get(2));
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("a", "Amritsar");
		hm2.put("b","bangalore");
		
		Set sn = hm2.entrySet();
		Iterator it = sn.iterator();
		while (it.hasNext() ) {
			Map.entry(null, null)
			
		}
	}

}
