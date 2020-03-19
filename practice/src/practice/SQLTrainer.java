package practice;

public class SQLTrainer extends Trainer {
public SQLTrainer(String string, String string2) {
		super(string, string2);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	SQLTrainer sql=new SQLTrainer("EEE", "PAYILAGAM");
	String s=sql.dept;
	String t=sql.Institute;
	System.out.println(s);
	System.out.println(t);
	System.out.println(sql.getSalary());
	
	
}


	// TODO Auto-generated method stub
	
}

