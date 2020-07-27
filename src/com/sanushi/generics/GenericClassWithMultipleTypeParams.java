package com.sanushi.generics;


// This is a generic class with multiple type parameters
class Elements<T extends Number, S> {
	private T number;
	private S element;
	
	public Elements(T number, S element) {
		this.number = number;
		this.element = element;
	}
	
	public void printElements() {
		System.out.println("Number: " + number);
		System.out.println("Element: " + element);
	}
}


/**
 * @author Sanushi Salgado
 *
 */
public class GenericClassWithMultipleTypeParams {
	
	public static void main(String[] args) {
		Elements<Integer, String> e1 = new Elements<Integer, String>( new Integer(10), "Bob" );
		e1.printElements();
		
		Elements<Double, String> e2 = new Elements<Double, String>( new Double(10.56), "Mike" );
		e2.printElements();
		
		Elements<Float, String> e3 = new Elements<Float, String>( new Float(10.56F), "Ann" );
		e3.printElements();
		
		Elements<Integer, Integer> e4 = new Elements<Integer, Integer>( new Integer(8), new Integer(3) );
		e4.printElements();
		
		Elements<Double, Character> e5 = new Elements<Double, Character>( new Double(4.3), 'c' );
		e5.printElements();
		
		// This will give a compile error since the 1st argument should be a subclass of Number
		// Elements e6 = new Elements( "Jack", 'c' ); 
		// e6.printElements();
		
	}
	
}
