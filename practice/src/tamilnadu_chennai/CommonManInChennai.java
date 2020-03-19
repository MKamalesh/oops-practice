package tamilnadu_chennai;

public class CommonManInChennai implements Trafficrules {
	public static void main(String[] args) {
		CommonManInChennai c=new CommonManInChennai();
		c.goByDieselVehicle();
		c.goByBicycle();
	}



	@Override
	public void goByDieselVehicle() {
		System.out.println("car");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goByBicycle() {
		System.out.println("hero");
		// TODO Auto-generated method stub
		
	}

}
