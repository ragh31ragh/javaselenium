package coreJavaLearningtwofive;

public class exceptionDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 4;
		int b = 7 ;
		int c = 0;
		
		try {
			
			// int k = b/c ;
			int arr[] = new int[5];
			System.out.println(arr[7]);
			
		}
		
		catch (ArithmeticException et) {
			System.out.println("Arithmetic excpetion");
		}
		
		catch (IndexOutOfBoundsException ets) {
			System.out.println("index bound excpetion");
		}
		
		catch (Exception e ) {
			System.out.println("Catched excpetion");
			
		}
		
		finally {
			System.out.println("Deleted cookies");
		}
		
		//exceptionDemo ed = new exceptionDemo();
		//ed.getData();

	}

}
