package com.bootcamp.spring.firstspring.LooselyCoupled;

public class BinarySearch {
	private Sorting sorting;
	BinarySearch(Sorting sorting){
		this.sorting=sorting;
	}
	
	public int binarySearch(int[] arr,int key) {
		arr=sorting.sort(arr);
		
		//Searching
		int n = arr.length;  
	     int temp = 0;  
	      for(int i=0; i < n; i++){  
	              for(int j=1; j < (n-i); j++){  
	                       if(arr[j-1] > arr[j]){  
	                              //swap elements  
	                              temp = arr[j-1];  
	                              arr[j-1] = arr[j];  
	                              arr[j] = temp;  
	                       }
	              		}
	              	}
	      //Binary Search
	      int first=0;
	      int last=arr.length-1;
	      
	      int mid = (first + last)/2;  
	      while( first <= last ){  
	         if ( arr[mid] < key ){  
	           first = mid + 1;     
	         }else if ( arr[mid] == key ){  
//	           System.out.println("Element is found at index: " + mid);  
	           return mid;

	         }else{  
	            last = mid - 1;  
	         }  
	         mid = (first + last)/2;  
	         
	         if ( first > last ){  
	        	 return -1;
//	             System.out.println("Element is not found!");  
	            
	          }
	      }  

	      return -1;
		
		
	}
}
