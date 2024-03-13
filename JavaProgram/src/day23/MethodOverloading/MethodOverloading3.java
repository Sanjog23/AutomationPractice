package day23.MethodOverloading;


public class MethodOverloading3 {

	//is it possible to achieve method overloading by changing only return type of method? NO
	int getReverseNumber() {
			int rev = 0, rem;
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			return rev;
	}
	void getReverseNumber() {
		int rev = 0, rem,num=123;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
	}
}