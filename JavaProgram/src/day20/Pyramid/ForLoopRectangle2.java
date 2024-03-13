package day20.Pyramid;

public class ForLoopRectangle2 {

	public static void main(String[] args) {
		int row=4,column=15;
for(int i=1;i<=row;i++) {
	for(int j=1;j<=column;j++) {
		if((i==1||i==4)||(j==1||j==15)) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
