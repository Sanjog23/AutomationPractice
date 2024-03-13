package day27.constructor;

public class AreaOfSquare {

	double length=25;
	static double breath=25;

	public static void main(String[] args) {
		AreaOfSquare obj=new AreaOfSquare(50);
		System.out.println("Area of circle(non static): "+obj.getSquareArea());
		double length=75;
		System.out.println("Area of circlr(static): "+obj.getSquareArea(length));
		AreaOfSquare obj1=new AreaOfSquare();
		System.out.println("Area of square (method overloading): "+obj1.getSquareArea(length));
	}
	AreaOfSquare()
	{
		System.out.println("Calling default constructor");
	}
	AreaOfSquare(double length) {
		this();
		this.length=length;
	}
	public double getSquareArea() {
		return length*breath;
	}
	public double getSquareArea(double length) {
		return length*breath;
	}

}
//non-static global variable
// static global variable
// non-static global method use this keyword
// static global method
// method overloading
// constructor with overloading and with this()