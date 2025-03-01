package variablesRelated;

public class StaticVar {
	
	String name ; //Instance variables 
	String address ;  //Instance variables 
	//String city;
	//static String city = "Mysore"; //class variables 
	//static int i = 0;
	static String city ;
	static int i ;
	static {
		i = 0 ;
		city = "mysore" ;
	}
	
	//StaticVar(String name , String address, String city ){
	StaticVar(String name , String address ){
		this.name = name ;//Local variables 
		this.address = address ;//Local variables 
		//this.city = city;
		i++ ;
		System.out.println(i);
		
		
	}
	
	public void getAddress() {
		//System.out.println(address);
		//return address ;
		System.out.println(address+" ,"+city);
	}
	
	public static void getcity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StaticVar obj = new StaticVar("Paul","marathalli","mysore");
		//StaticVar obj2  = new StaticVar("shaw","jayanagar","mysore");
		StaticVar obj = new StaticVar("Paul","marathalli");
		StaticVar obj2  = new StaticVar("shaw","jayanagar");
		StaticVar obj3  = new StaticVar("jack","jayanagar");
		obj.getAddress();
		obj2.getAddress();
		obj3.getAddress();
		StaticVar.getcity();
		StaticVar.i=4;
		
	
	}

}
