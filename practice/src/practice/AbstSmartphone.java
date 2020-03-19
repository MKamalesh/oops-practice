package practice;

public abstract class AbstSmartphone {

     abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browser()
	{
		System.out.println("system browsing");
	}
	public AbstSmartphone()
	{
		System.out.println("smartphone Under development");
	}
}

