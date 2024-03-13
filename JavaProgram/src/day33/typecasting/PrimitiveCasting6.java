package day33.typecasting;
class Sample1
{
    double test1()
    {
        System.out.println("Running test1");
        return 4;//implicit widening
    }     
}
public class PrimitiveCasting6 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample1 s=new Sample1();
        System.out.println("return value: "+s.test1());
        int res=(int)s.test1();//explicit narrowing
        System.out.println("return value="+res);
        System.out.println("Program ends");
    }
}