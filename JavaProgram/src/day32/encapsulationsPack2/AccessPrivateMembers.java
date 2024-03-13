package day32.encapsulationsPack2;

import day32.encapsulationsPack1.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

/**
 * If your try to access one package class to another package dn you have to use impport statement
 */
