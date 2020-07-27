package com.sanushi.generics;


// This is a generic class 
class Element <T> {
	private T element;
	
	public Element(T element) {
		this.element = element;
	}
	
	public void printElement() {
		System.out.println(element);
	}
}


// This is a generic class with bounded type parameters
class NumberElement <T extends Number> {
	private T element;
	
	public NumberElement(T element) {
		this.element = element;
	}
	
	public void printElement() {
		System.out.println(element);
	}	
}



/**
 * @author Sanushi Salgado
 *
 */
public class GenericClass {
	
	public static void main(String[] args) {
		
		// Instantiate Element Class
		Element<Integer> e1 = new Element<Integer>( new Integer(10) );
		e1.printElement();
		
		Element<Double> e2 = new Element<Double>( new Double(10.5) );
		e2.printElement();

		Element<Float> e3 = new Element<Float>( new Float(10.2f) );
		e3.printElement();

		Element<String> e4 = new Element<String>( new String("Abc") ); 
		e4.printElement();
		
		
		// Instantiate NumberElement Class
		NumberElement<Integer> n1 = new NumberElement<Integer>( new Integer(10) );
		n1.printElement();
		
		NumberElement<Double> n2 = new NumberElement<Double>( new Double(10.5) );
		n2.printElement();

		NumberElement<Float> n3 = new NumberElement<Float>( new Float(10.2f) );
		n3.printElement();

		// This will give a compile error as it is only expecting numbers
		// NumberElement n4 = new NumberElement( new String("Abc") ); 
		// n4.printElement();
		
		
	}
	
}