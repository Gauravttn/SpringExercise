package com.bootcamp.spring.firstspring.TightlyCoupledQ1;

public class Program {
	
	public static void main(String[] args) {
		BinarySearchTightlyCoupled obj=new BinarySearchTightlyCoupled();
		int arr[]= {4,3,5,7,3,1,9};
		int num=7;
		
		int res=obj.BinarySearch(arr, num);
		if(res==-1) {
			System.out.println("Element not found");

		}
		else {
		System.out.println("Element found at index"+res);
	}
	}
	

}
