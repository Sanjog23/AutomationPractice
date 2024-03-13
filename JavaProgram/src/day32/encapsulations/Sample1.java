package day32.encapsulations;

public class Sample1 {
	private int age=25;
	private double salary=25000.56;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
class AccessPrivateMembers{
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		//System.out.println(s1.age); //can't access private members from outside the class
		//System.out.println(s1.salary); //can't access private members from outside the class
		System.out.println(s1.getAge());
		System.out.println(s1.getSalary());
		s1.setAge(30);
		s1.setSalary(45000);
		System.out.println(s1.getAge());
		System.out.println(s1.getSalary());
	}
}