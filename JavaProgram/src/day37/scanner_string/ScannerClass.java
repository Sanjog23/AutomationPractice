package day37.scanner_string;

import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {

		//int num1=10,num2=20,result=num1+num2;
			//or
		int num1,num2,result;
		//to read data at runtime create instance of Scanner class
		Scanner scn=new Scanner(System.in);
		//to read diff type of data from keyboard use appropriate method of Scanner class
		System.out.println("Please enter number1: ");
		num1=scn.nextInt();
		System.out.println("Please enter number2: ");
		num2=scn.nextInt();
		result=num1+num2;
		System.out.println("number1: "+num1);
		System.out.println("number2: "+num2);
		System.out.println("result: "+result);
		System.out.println("Please provide operator to perform required operation: ");
		char ops=scn.next().charAt(0);
		System.out.println(addNumber(ops, num1, num2));
	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}
}
