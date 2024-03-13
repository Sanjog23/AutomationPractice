package day37.scanner_string;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="Pune";
		String s2="Pune";
		String s3="Bangalore";
		System.out.println("String object s1: "+s1);
		System.out.println("String object s2: "+s2);
		System.out.println("String object s3: "+s3);		
		System.out.println("Char count in S1 object: "+s1.length());
		System.out.println("Char count in S2 object: "+s2.length());
		System.out.println("Char count in S3 object: "+s3.length());		
		System.out.println("check s1 and s2 both objects based on value: "+s1.equals(s2));
		System.out.println("check s1 and s3 both objects based on value: "+s1.equals(s3));
		System.out.println("check s1 and s2 both objects based on address: "+(s1==s2));
		System.out.println("check s1 and s3 both objects based on address: "+(s1==s3));
		
		String s4=new String("Pune");
		System.out.println("String object s4: "+s4);
		System.out.println("check s1 and s4 both objects based on value: "+s1.equals(s4));
		System.out.println("check s1 and s4 both objects based on address: "+(s1==s4));
		
		String s5=new String("Pune");
		System.out.println("String object s5: "+s5);
		System.out.println("check s5 and s4 both objects based on value: "+s5.equals(s4));
		System.out.println("check s5 and s4 both objects based on address: "+(s5==s4));

	}

}
/*
String:
-	predefined class belongs to java.lang
-	it represent group or sequence of characters
-	it implements 3 interface at a time
-	it is also know as immutable class which mean once object is created its value can't be chages if you try to change it will create new object instead of modifying existing object
	
-	its object can be created in 2 ways-
		1. using literal ""
			-will be created uniquely inside "string constant pool"
			-this won;t allow to create duplicate objects
			-if you will try then it will point to the existing object instead of creating duplicate
		2. using new keyword
			-will be created inside non constant pool area
			-here we are allowed to create duplicate object
- there several methods of Object class will be overrided here
		-toString() ---> FQCA it will give the value stored in object
		-equal(Object obj) --> instead comparing object based on address it will compare them using value
		-== -->instead compare two value it will compare two object based on there address
*/