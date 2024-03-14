package march10.practice;

public class ReverseArray1 {

	void reverse(int a[],int n) {
		int b[]=new int [n];
		int j=n;
		System.out.println("Array length: "+n);
		System.out.print("Original array: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
			b[j-1]=a[i];
			j=j-1;
		}
		System.out.print("\nReversed array: ");
		for(int k =0;k<n;k++) {
			System.out.print(b[k]+",");
		}
	}
	public static void main(String[] args) {

		int arr[]={10,20,30,40,50,60};
		ReverseArray1 rev=new ReverseArray1();
		rev.reverse(arr, arr.length);
		
	}

}