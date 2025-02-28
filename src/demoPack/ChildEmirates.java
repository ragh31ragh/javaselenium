package demoPack;

public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args) {
		
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.SafetySystemGuidelines();
		c.bodycolour();
		}

	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub

		System.out.println("green body colour");
		
	}

}
