package day18.Practice;

public class PrimeNoUsingFor {

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 to 50 are: ");

		for (int i = 2; i <= 50; i++) 
		{
			int count = 0;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{
					count++;
				}
			}
			if (count == 2) 
			{
				System.out.println(i);
			}
		}

	}

}
