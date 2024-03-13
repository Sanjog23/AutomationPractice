package day37.scanner_string;

public class StringExample2 {

	public static void main(String[] args) {
		String s1="Pune";
		//System.out.println("char at index 0 in s1 object: "+s1.charAt(0));
		for(int i=0;i<s1.length();i++) {
			System.out.println("char at index "+i+" in s1 object: "+s1.charAt(i));
		}
		System.out.println("****************reverse string*********************");
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			temp=temp+s1.charAt(i);
		}
		System.out.println("Reverse string is : "+temp);
		System.out.println("***************************************************");
		System.out.println("String in upper case: "+s1.toUpperCase());
		System.out.println("String in lower case: "+s1.toLowerCase());
		
		System.out.println("After concatination with s1: "+s1.concat("Mumbai"));
		System.out.println("Original s1 object: "+s1);
		System.out.println("**************************************************");
		//String str1=s1.concat(2465); except on string parameter
		String str2=s1+12345;//we can concat even number here
		
		System.out.println("***************************************************");
		String st="Bangalore";
		System.out.println("is st object contain 'lo': "+st.contains("lo"));
		System.out.println("is st object starts with 'Ban': "+st.startsWith("Ban"));
		System.out.println("is st object ends with 're': "+st.endsWith("re"));
		String st2="bangalore";
		System.out.println("st and st2 comparision with value: "+st.equals(st2));
		System.out.println("st and st2 comparision with value excluding casing: "+st.equalsIgnoreCase(st2));
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