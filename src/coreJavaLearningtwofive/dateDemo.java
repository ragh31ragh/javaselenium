package coreJavaLearningtwofive;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		//System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM/DD/YYYY");
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, MMM d, YYYY");
		System.out.println(sdf.format(d));
		System.out.println(sdf2.format(d));
		//"EEE, MMM d, ''yy"

	}

}
