package day27.constructor;

public class Example8 {
	Example8(){
		System.out.println("I am zero param cons...");
	}
	Example8(int n1, double n2){
		this();
		System.out.println("I am int double param cons...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example8 e1=new Example8(25,25000.85);
		System.out.println("Program ends");

	}

}
