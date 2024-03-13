package day36.object_system;
class Testing{
	void calling() {
		System.out.println("I am calling from Testing class");
	}
}
public class Sample2{
	
	public String toString() {
		return "Hello";
	}
	public int hashCode() {
		return 101;
	}
	public boolean equals(Object obj) {
		return true;
	}	
	public static void main(String[] args) {
		
		Sample2 s1=new Sample2();
		System.out.println("S1 object using overrided toString(): "+s1);
		System.out.println("S1 object using overrided hashCode(): "+s1.hashCode());
		Sample2 s2=new Sample2();
		System.out.println("S2 object using overrided toString(): "+s2);
		System.out.println("S2 object using overrided hashCode(): "+s2.hashCode());
		System.out.println("S1 & S2 comparision using overrided equals(): "+s1.equals(s2));
		System.out.println("****************************************");
		Testing t1=new Testing();
		System.out.println("T1 object using toString(): "+t1);
		System.out.println("T1 object using hashCode(): "+t1.hashCode());
		Testing t2=new Testing();
		System.out.println("T2 object using toString(): "+t2);
		System.out.println("T2 object using hashCode(): "+t2.hashCode());
		System.out.println("T1 & T2 comparision using equals(): "+t1.equals(t2));
	}
}
/*
Object class is a super most class in java, which belongs for java.lang package
this package is not required to import as this will be by default available in call java classes
Each and every class in java directly or indirectly inherited from Object class
Object class has several useful methods declared as public like-
	toString()-->String: used to give String representation of an Object that will be 
						FullyQualifiedClassname@HexadecimalAddress
						package.classname@HexadecimalAddress
	hashCode()-->int: used to convert HexadecimalAddress into integer
	equals()---->boolean: used to compare to objects based on there address
*/