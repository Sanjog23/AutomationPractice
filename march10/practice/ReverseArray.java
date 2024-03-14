package march10.practice;

public class ReverseArray {

	static void reverse(int a[], int n) {
		System.out.println("Length of array: " + n);
		System.out.println("Original array: ");
		for (int j = 0; j < n; j++) {
			System.out.print(a[j]);
		}
		System.out.println("\nReversed array: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(+a[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		ReverseArray.reverse(arr, arr.length);

	}

}
