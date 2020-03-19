package practice;

public class InterActorSivakumar implements InterfaceActor{
	static String address="coimbatore"; 
public InterActorSivakumar(int i, String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	InterActorSivakumar as=new InterActorSivakumar(65,"Audi Car");
	as.speaking();
	InterfaceActor ac=new InterActorSivakumar(0, address);
	ac.act();
	ac.dance();
	ac.sang();
	System.out.println(ac.address);
	
}

private void speaking() {
	// TODO Auto-generated method stub
	
}

@Override
public void act() {
	System.out.println("movie");
	// TODO Auto-generated method stub
	
}

@Override
public void dance() {
	System.out.println("music");
	// TODO Auto-generated method stub
	
}

@Override
public void sang() {
	System.out.println("song");
	// TODO Auto-generated method stub
	
}
}
