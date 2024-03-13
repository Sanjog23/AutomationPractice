package Dec16th_AllProgramPractice;

public class SwapTwoNo_5 {

	public static void main(String[] args) {

		float first=22.5f,second=14.25f;
		
		System.out.println("--Before Swap--");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+second);
		
		//value of first is assigned to temporary
		float temporary=first;
		
		//Value of second is assigned to first
		first=second;
		
		//Value of temporary (which contains the initial value of first) is assigned to second
		second=temporary;
		
		System.out.println("\n--After Swap--");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+second);
		
	}

}
