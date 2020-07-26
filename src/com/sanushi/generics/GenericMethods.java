package com.sanushi.generics;

public class GenericMethods {

	// This is a generic method
	public static <T> void printElements(T[] array) {
		for (T element : array)
			System.out.print(element + ", ");

		System.out.println();
	}

	 /*This is a generic method with bounded type parameters
	 This method accepts only arrays with numbers
	 Finally it prints the sum of all numbers in the given array*/
	public static <T extends Number> double printSum(T[] array) {
		double sum = 0;
		for (T element : array) {
			sum += element.doubleValue();
		}

		return sum;
	}
	
	
	// This is a generic method with multiple type parameters
	public static <T extends Number, S> void printElement(T number, S element) {
		System.out.println(number + " " + element);
	}

	
	public static void main(String[] args) {
		Integer[] intArray = { 1, 3, 5, 2, 9 };
		printElements(intArray);
		System.out.printf("Sum: %.2f\n\n", printSum(intArray));

		Double[] doubleArray = { 4.0, 3.2, 8.5, 2.4 };
		printElements(doubleArray);
		System.out.printf("Sum: %.2f\n\n", printSum(doubleArray));

		Float[] floatArray = { 0f, 1.2f, 5F };
		printElements(floatArray);
		System.out.printf("Sum: %.2f\n\n", printSum(floatArray));

		String[] strArray = { "Sandra", "Jack", "Bob", "Mike" };
		printElements(strArray);
		// System.out.printf("%.2f\n", printSum(strArray)); // This will give a compile error because only numbers are expected

		Character[] charArray = { 'J', 'd', 's', 't' };
		printElements(charArray);	
		// System.out.printf("%.2f\n", printSum(charArray)); // This will give a compile error because only numbers are expected

		
		printElement(10, "Hello");
		// printElement("Ann", "Hello"); // This will give a compile error because only numbers are expected for the 1st argument
		// printElement(new Character('s'), "Hello"); // This will give a compile error
		printElement(new Double(4.678), 20.33);
		printElement(new Float(4.678F), 'c');
		printElement(new Integer(47), 20);
		
	}

}
