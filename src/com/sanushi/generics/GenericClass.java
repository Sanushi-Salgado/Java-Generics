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



public class GenericClass {
	
	public static void main(String[] args) {
		
		// Instantiate Element Class
		Element e1 = new Element( new Integer(10) );
		e1.printElement();
		
		Element e2 = new Element( new Double(10.5) );
		e2.printElement();

		Element e3 = new Element( new Float(10.2f) );
		e3.printElement();

		Element e4 = new Element( new String("Abc") ); 
		e4.printElement();
		
		
		// Instantiate NumberElement Class
		NumberElement n1 = new NumberElement( new Integer(10) );
		n1.printElement();
		
		NumberElement n2 = new NumberElement( new Double(10.5) );
		n2.printElement();

		NumberElement n3 = new NumberElement( new Float(10.2f) );
		n3.printElement();

		/*
		// This will give a compile error as it is only expecting numbers
		NumberElement n4 = new NumberElement( new String("Abc") ); 
		n4.printElement();
		*/
		
	}
	
}