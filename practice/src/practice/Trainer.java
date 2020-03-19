package practice;

public class Trainer {

private int salary=10000;
String dept="java";
String Institute="Payilagam";
public Trainer(String string, String string2) {
	this.dept=string;
	this.Institute=string2;
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	Trainer trainerKumar=new Trainer("CSE","Payilagam");
	trainerKumar.training();
	
}
private void training() {
	System.out.println(dept);
	System.out.println(Institute);
	System.out.println(salary);
	// TODO Auto-generated method stub
	
}
public int getSalary() {
	return salary;
}


}

