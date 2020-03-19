package practice;

public class AbstSamsung extends AbstFactory{
	static int price=5000;
public static void main(String[] args) {
	AbstSamsung sam=new AbstSamsung();
	sam.browser();
	System.out.println(sam.price);
}

@Override
void verifyFingerPrint() {
	// TODO Auto-generated method stub
	
}

@Override
void providePattern() {
	// TODO Auto-generated method stub
	
}

@Override
int call(int seconds) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
void sendMessage() {
	// TODO Auto-generated method stub
	
}

@Override
void receiveCall() {
	// TODO Auto-generated method stub
	
}
}
