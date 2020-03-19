package practice;

public class Abst2Tamilnadu extends Abst2SouthIndia {
	static String capital="chennai";
public Abst2Tamilnadu(String PrimeMinister) {
		super(PrimeMinister);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	System.out.println(Abst2India.capital);
	System.out.println(Abst2Tamilnadu.capital);
	Abst2SouthIndia si=new Abst2Tamilnadu("kamalesh");
	
}
void cultivate()
{
	System.out.println("rice and sugarcane cultivation");
}
void livingStyle()
{
	System.out.println("above average development");
}

@Override
void speakLang() {
	System.out.println("Tamil");
	// TODO Auto-generated method stub
	
}

@Override
void eat() {
	System.out.println("Idly");
	// TODO Auto-generated method stub
	
}

@Override
void dress() {
	System.out.println("vetti satta");
	// TODO Auto-generated method stub
	
}
}
