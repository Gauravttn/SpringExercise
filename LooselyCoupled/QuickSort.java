package com.bootcamp.spring.firstspring.LooselyCoupled;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements Sorting{
	
	@Override
	public int[] sort(int[] arr) {
		int low = 0 , high = arr.length-1;
		int pivot = arr[high];
		int i = (low-1);
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return arr;
	}
}