package com.sanushi.generics;


interface Playable {
	
	void play();
	
}

abstract class Animal {
	
	abstract void eat();

}


class Dog extends Animal implements Playable {
	
	@Override
	public void eat() {
		System.out.println("Dogs eat bones");
	}
	
	@Override
	public void play() {
		System.out.println("Dogs like to play with balls");
	}
	
}


class Crocodile extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Crocodiles eat animal flesh");
	}
	
}


/**
 * This class denotes the use of multiple bounds in Generics
 * 
 * @author Sanushi Salgado
 *
 */
public class MultipleBounds<T extends Animal & Playable> {

	public <T extends Animal & Playable> void printPlayingMethod(T object) {
		 object.play();
	}
	
	public <T extends Animal> void printEatMethod(T object) {
		object.eat();
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		Crocodile crocodile = new Crocodile();
		
		new MultipleBounds<Dog>().printPlayingMethod(dog);
		
		// Compile error - since the Crocodile class doesn't implement the Playable interface
		// We are expecting a class, that extends the Animal class while implementing the Playable interface
		// new MultipleBounds<Crocodile>()..printEatMethod(crocodile);
		
	}

}
