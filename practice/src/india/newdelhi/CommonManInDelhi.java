package india.newdelhi;

import tamilnadu_chennai.Trafficrules;

public class CommonManInDelhi implements TrafficrulesDelhi,Trafficrules {
public static void main(String[] args) {
	CommonManInDelhi cm=new CommonManInDelhi();
	cm.dontGoByDieselVehicle();
	cm.goByBicycle();
	
}

@Override
public void dontGoByDieselVehicle() {
	System.out.println("no pollution");
	// TODO Auto-generated method stub
	
}

@Override
public void goByBicycle() {
	System.out.println("bsv");
	// TODO Auto-generated method stub
	
}

@Override
public void goByDieselVehicle() {
	System.out.println("lorry");
	// TODO Auto-generated method stub
	
}
}
