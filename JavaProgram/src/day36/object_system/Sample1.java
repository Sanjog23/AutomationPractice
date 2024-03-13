package day36.object_system;

public class Sample1{

	public static void main(String[] args) {
		
		Sample1 s1=new Sample1();
		System.out.println("S1 object String representation using explicit toString() : "+s1.toString());
		System.out.println("S1 object String representation with implicit toString(): "+s1);
		System.out.println("S1 object hexadecimal into number using hashCode(): "+s1.hashCode());
		System.out.println("**********************************************");
		Sample1 s2=new Sample1();
		System.out.println("S2 object String representation using explicit toString() : "+s2.toString());
		System.out.println("S2 object String representation with implicit toString(): "+s2);
		System.out.println("S2 object hexadecimal into number using hashCode(): "+s2.hashCode());
		System.out.println("**********************************************");
		System.out.println("are S1 and S2 both object same ? "+s1.equals(s2));
		System.out.println("**********************************************");
		Sample1 s3=s2;
		System.out.println("S3 object String representation using explicit toString() : "+s3.toString());
		System.out.println("S3 object String representation with implicit toString(): "+s3);
		System.out.println("S3 object hexadecimal into number using hashCode(): "+s3.hashCode());
		System.out.println("are S2 and S3 both object same ? "+s3.equals(s2));
	}
	
	void display() {
		System.out.println("I am display method of class Sample1");
	}
}
/*
Object class is a super most class in java, which belongs for java.lang package
this package is not required to import as this will be by default available in call java classes
Each and every class in java directly or indirectly inherited from Object class
Object class has several useful methods like-
	toString()-->String: used to give String representation of an Object that will be 
						FullyQualifiedClassname@HexadecimalAddress
						package.classname@HexadecimalAddress
	hashCode()-->int: used to convert HexadecimalAddress into integer
	equals()---->boolean: used to compare to objects based on there address
*/