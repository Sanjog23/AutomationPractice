package day23.MethodOverloading;

public class MethodOverloading4 {


		//can we overload main()? YES
		static void main() {
			System.out.println("I am main()");
		}
		
		public static void main(String[] args) {
			System.out.println("I am main(String)");
			main();
		}
	}