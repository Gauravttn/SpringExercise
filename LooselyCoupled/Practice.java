package com.bootcamp.spring.firstspring.LooselyCoupled;

public class Practice {
	
	public static void main(String args[]) {
		BinarySearch obj=new BinarySearch(new QuickSort());
		
		int[] arr= {20,12,45,33,22,1,66,55,3};
		int res=obj.binarySearch(arr, 22);
		if(res==-1) {
			System.out.println("Element Not Found");

		}
		System.out.println("Element is **PRESENT** in the array");
	}

}
