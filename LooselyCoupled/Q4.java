package com.bootcamp.spring.firstspring.LooselyCoupled;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.SpringApplication;
@Configuration
@ComponentScan
public class Q4 {
public static void main(String[] args) {
	ApplicationContext app = SpringApplication.run(Q4.class,args);
	BinarySearch searching = app.getBean(BinarySearch.class);
	int[] numbers = {5,55,67,89,71,101,2,88,110,56};
	System.out.println("Index of given Value is - " +
	
	searching.binarySearch(numbers, 110));
	}
}