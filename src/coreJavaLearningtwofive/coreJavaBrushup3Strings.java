package coreJavaLearningtwofive;

public class coreJavaBrushup3Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "raghavendra automation training" ;
		String[] splittedString = s.split("automation");
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[2]);
		
		System.out.println("#######");
		for ( int i = 0; i < s.length(); i++) {
			//s.charAt(i);
			System.out.println(s.charAt(i));
		}
		System.out.println("### Reverse String ####");
		for ( int j = s.length()-1 ; j >= 0 ; j--) {
			//s.charAt(i);
			//System.out.println("abc");
			System.out.println(s.charAt(j));
		}

	}

}
