package com.bootcamp.spring.firstspring.LooselyCoupled;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary // We use @Primary for resolving the conflict while calling the constructor of BinarySearch class
@Component
public class SelectionSort implements Sorting{

	@Override
	public int[] sort(int[] arr) {
	       for (int i = 0; i < arr.length - 1; i++)  
	        {  
	    	   
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j; 
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	       return arr;
	}

}
