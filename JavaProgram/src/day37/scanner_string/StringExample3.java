package day37.scanner_string;

public class StringExample3 {

	public static void main(String[] args) {
		String str="Pune is known for IT";
		String[] words=str.split(" ");
		for(String s1:words) {
			System.out.println(s1);
		}
		System.out.println("*************Split with limit*****************");
		String[] word2=str.split(" ",2);
		for(String s1:word2) {
			System.out.println(s1);
		}
		System.out.println("**********************************************");
		String str1=" Pune is know for IT       ";
		System.out.println("Str1: "+str1);
		System.out.println("Char count in str1: "+str1.length());
		System.out.println("str1 without prefix and postfix spaces: "+str1.trim());
		System.out.println("char count in str1 without prefix and postfix spaces: "+str1.trim().length());
		System.out.println("**************************************************");
		String str2="Welcome to Automation Session, you are learning CoreJava";
		String subStringfromIndex7=str2.substring(7);
		String subStringfromIndex8To10=str2.substring(7,10);
		System.out.println("String str2: "+str2);
		System.out.println("String subStringfromIndex7:->"+subStringfromIndex7);
		System.out.println("String subStringfromIndex8To10:->"+subStringfromIndex8To10);
		System.out.println("*************************************************");
		String str3="CoreJavaBasics";
		System.out.println("index of 'a' in str3: "+str3.indexOf('a'));
		System.out.println("index of 's' in str3: "+str3.indexOf('s'));
		System.out.println("last index of 's' in str3: "+str3.lastIndexOf('s'));
		System.out.println("last index of 'a' in str3: "+str3.lastIndexOf('a'));
		
		System.out.println("check str3 is empty or not? "+str3.isEmpty());
		
		System.out.println("String str3: "+str3);
		String s1=str3.replace('a', 'X');
		System.out.println("String s1: "+s1);
		
		String s2=str3.replaceFirst("a", "Z");
		System.out.println("String s2: "+s2);
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