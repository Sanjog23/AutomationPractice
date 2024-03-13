package day32.encapsulationsPack2;

public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		day32.encapsulationsPack1.PublicMembers p1=new day32.encapsulationsPack1.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		day32.encapsulationsPack1.PublicMembers p2=new day32.encapsulationsPack1.PublicMembers();
		
	}
}
