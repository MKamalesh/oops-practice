package practice;

public abstract class AbstFactory extends AbstSmartphone {
	boolean isOriginalPiece=false;
	static int price=0;
	abstract void verifyFingerPrint();
	abstract void providePattern();
	void browsing()
	{
		System.out.println("factory demo browsing");
	}
	

}
