package com.sanushi.generics;


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


public class GenericClassWithMultipleTypeParams {
	
	public static void main(String[] args) {
		Elements e1 = new Elements( new Integer(10), "Bob" );
		e1.printElements();
		
		Elements e2 = new Elements( new Double(10.56), "Mike" );
		e2.printElements();
		
		Elements e3 = new Elements( new Float(10.56F), "Ann" );
		e3.printElements();
		
		Elements e4 = new Elements( new Integer(8), new Integer(3) );
		e4.printElements();
		
		Elements e5 = new Elements( new Double(4.3), 'c' );
		e5.printElements();
		
		/*
		// This will give a compile error since the 1st argument should be a subclass of Number
		Elements e6 = new Elements( "Jack", 'c' ); 
		e6.printElements();*/
		
	}
	
}
