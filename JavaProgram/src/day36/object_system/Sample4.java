package day36.object_system;

public class Sample4 {
	public static void main(String[] args) {
		System.out.println("Current Dir: "+System.getProperty("user.dir"));
		System.out.println("Current user Dir: "+System.getProperty("user.home"));
		System.out.println("JAVA version: "+System.getProperty("java.home"));
		System.out.println("OS version: "+System.getProperty("os.version"));
		System.out.println("OS name: "+System.getProperty("os.name"));
		System.clearProperty("user.dir");
		System.out.println("Current Dir: "+System.getProperty("user.dir"));
		System.setProperty("user.dir", "C:\\MyProfile");
		System.out.println("Current Dir: "+System.getProperty("user.dir"));
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		System.exit(0);//terminates program execution
		System.out.println("********** Thank you, pls do revisit ***************");
	}
}
