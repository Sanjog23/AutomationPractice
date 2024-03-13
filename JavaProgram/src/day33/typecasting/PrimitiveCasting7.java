package day33.typecasting;
public class PrimitiveCasting7 {
	static void calling(double num) {//double num=12345; // implicit widening
		System.out.println("I am calling: "+num);//12345.0
	}
	static double getSum(int num1,double num2) {//int num1=25; double num2=50;//implicit widening
		return num1+num2;
	}
    public static void main(String[] args) {
        System.out.println("Program starts");
        calling(12345);
        int res=(int)getSum(25, 50);//explicti narrowing
        System.out.println("result: "+res);//75
        System.out.println("Program ends");
    }
}