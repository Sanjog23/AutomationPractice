package day29.Inheritance_overriding;

//Parent class
class fruit{
	fruit(){
		System.out.println("Fruit class cons....");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class apple extends fruit{
	apple(){
		//super(); java compiler will write default super()
		System.out.println("Apple class cons...");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple a1=new apple();
		a1.taste();// call method of parent class
		a1.shape();// call method of child class

	}

}
