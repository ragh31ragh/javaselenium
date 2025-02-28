package demoPack;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellow();
		AustralianTraffic b = new AustralianTraffic();
		b.walkonsymbol();
		ContinentalTraffic c = new AustralianTraffic();
		c.TrainSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
		
	}

	public void walkonsymbol() {
		// TODO Auto-generated method stub
		System.out.println("walk on symbol");
		
	}
	
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train stop implementation");
	}

}
