package day17_PracticeProgram;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2024;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("2024 is a leap year");
		} else
			System.out.println("2024 is not a leap year");
	}

}
