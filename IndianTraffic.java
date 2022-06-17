
public class IndianTraffic implements CentralTraffic, AsianTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic cf = new IndianTraffic();
		cf.RedLight();
		cf.GreenLight();
		cf.YellowLight();
		IndianTraffic it = new IndianTraffic();
		it.asianRules();
		it.GreenLight();
		AsianTraffic at = new IndianTraffic();
		at.chinaRules();
		at.GreenLight();
		

	}

	@Override
	public void RedLight() {
		// TODO Auto-generated method stub
		System.out.println("RedLight implementation "+a);
	}

	@Override
	public void GreenLight() {
		// TODO Auto-generated method stub
		System.out.println("GrrenLight implementation "+a);
		
	}

	@Override
	public void YellowLight() {
		// TODO Auto-generated method stub
		System.out.println("YellowLight implementation "+a);
		
	}
	public void classMethod() {
		System.out.println("class method implementation");
	}

	@Override
	public void asianRules() {
		// TODO Auto-generated method stub
		System.out.println("Asian rules implementation");

		
	}

	@Override
	public void chinaRules() {
		// TODO Auto-generated method stub
		System.out.println("China rules implementation");

	}
	
	
	

}
