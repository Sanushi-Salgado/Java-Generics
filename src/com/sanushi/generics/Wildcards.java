package com.sanushi.generics;

import java.util.Arrays;
import java.util.List;

/**
 * This class denotes the use of wildcards in Generics
 * 
 * @author Sanushi Salgado
 *
 */
public class Wildcards {

	// This method denotes a upper bounded wildcard
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}
	

	// This method denotes a lower bounded wildcard
	public static void printIntegers(List<? super Integer> list) {
		System.out.println(list);
	}
	
	
	// This method denotes an unbounded wildcard
	public static void printList(List<?> list) { 
		System.out.println(list + "\n"); 
	} 

	

	public static void main(String[] args) {
		
		List<Number> numberList = Arrays.asList(1, 3.0, 2.345f, 343);
		System.out.println("Sum: " + sum(numberList));
		printIntegers(numberList);
		printList(numberList);

		List<Integer> intList = Arrays.asList(1, 3, 2, 343);
		System.out.println("Sum: " + sum(intList));
		printIntegers(intList);
		printList(intList);

		List<Double> doubleList = Arrays.asList(3.3, 4.42, 5.52, 5.0);
		System.out.println("Sum: " + sum(doubleList) + "\n");
		printList(doubleList);
		// This will give a compile error as Double, is not a super class of Integer
		// printIntegers(doubleList); 

		
		List<Float> floatList = Arrays.asList(3.3F, 4.42F, 5.52F, 5.0F);
		System.out.println("Sum: " + sum(floatList) + "\n");
		printList(floatList);
		// printIntegers(floatList); // Compile error
		
		List<String> stringList = Arrays.asList("Bob", "Mike", "Ann");
		printList(stringList);
		// System.out.println("Sum: " + sum(stringList) + "\n"); // Compile error
		// printIntegers(stringList); // Compile error
		  		 
	}

}
