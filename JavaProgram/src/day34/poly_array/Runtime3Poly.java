package day34.poly_array;
class Car {
	int price=25000;
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	int price =50000;
}
public class Runtime3Poly {
	public static void main(String args[]) {
		Car c = new innova();
		c.run();
		System.out.println(c.price);//
	}
}