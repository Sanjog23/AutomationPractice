package day20.Pyramid;

public class Pyramid1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {// number of lines in pyramid
			for (int j = 1; j <= i; j++) { // value to be printed in pyramid
				System.out.print(j + " ");
			}
			System.out.println();
}
		System.out.println("****************************************");
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("****************************************");
		for (int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("****************************************");
		for( int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("*****************************************");
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*****************************************");
		for(int i=3;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print("--");
			}
			System.out.println();
		}
	}


}
