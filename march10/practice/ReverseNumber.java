package march10.practice;

public class ReverseNumber {

	public static void main(String[] args) {

		int num= 123456;
		ReverseNumber.reverse(num);
	
	}
	static void reverse(int num) {
		System.out.println("Original number: "+num);
		int reminder,reverse=0;
		for(;num!=0;num=num/10) {
			reminder=num%10;
			reverse = reverse*10+reminder;
		}
		System.out.println("Reversed number: "+reverse);
	}

}
