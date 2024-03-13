package day22.MethodFunction_2;

public class ReverseNumExample4 {

	public static void main(String[] args) {
		int i=123;
		System.out.println("Actual number is: "+i);
		int reverseNum=getReverse(i);
		System.out.println("Reverse number is: "+reverseNum);
		
		            //OR
		System.out.println("Number to reverse 456 and reverse number is: "+getReverse(456));

	}
// Write a program to reverse a number
	static int getReverse(int num) {
		int reverse=0,reminder;
		while(num!=0) {
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		return reverse;
	}
}
