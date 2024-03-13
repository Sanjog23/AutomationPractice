package day36.object_system;
class Automation{
	Automation(){
		System.out.println("I am Automation class cons..........");
	}
	void Selenium() {
		System.out.println("Hello everyone, Welcome to Automation session");
	}
	void CoreJava() {
		System.out.println("Hello everyone, Welcome to CoreJava session");
	}
}
public class Sample3 {
	//static reference
	static Automation ref=new Automation();
	public static void main(String[] args) {
		Automation a1=new Automation();
		a1.CoreJava();
		a1.Selenium();
		System.out.println("**********************************");
		Sample3.ref.CoreJava();
		Sample3.ref.Selenium();
	//classname.staticRefOfAutomation.nonstaticMethodOfAutomation
		System.out.println("I am Standard output");
	//classname.staticRefOfPrintStream.nonstaticMethodOfPrintStream
		System.err.println("I am Standard error output");
	}
}
