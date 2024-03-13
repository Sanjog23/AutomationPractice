package day42.collections;

import java.util.Arrays;
                  //USING ITERATIVE APPROACH

public class ValidateSortedOrder1 {

	private static boolean isSortedArray(int array[], int n) {
		if(n==1||n==0)return true;
		for(int i=1;i<n;i++) {
			if(array[i]<array[i-1])return false;
		}
return true;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("The array "+Arrays.toString(arr)+" "+(isSortedArray(arr,arr.length)?" is": "is not")+" sorted.");
		System.out.println("----------------");
		arr=new int [] {1,3,2,4,5};
		System.out.println("The array "+Arrays.toString(arr)+" "+(isSortedArray(arr,arr.length)?" is": "is not")+" sorted.");

	}

}
