package basics;

class Dog {
	void bark() {
		System.out.println("Dog -> Barks....");
	}
}

class Cat {
	void meow() {
		System.out.println("Cat -> Meow....");
	}
}
class Cow {
	void moo() {
		System.out.println("Cow -> Moo...");
	}
}
//Creating objects and Calling Methods

class Sounds {
	Dog d = new Dog();
	Cat c = new Cat();
	Cow b = new Cow();

	void dog() {
		d.bark();
	}

	void meow() {
		c.meow();
	}
	void moo() {
		b.moo();
	}
}

public class AnimalSoundSimulator {
	public static void main(String Args[]) {
		 Sounds a = new Sounds();
		a.dog();
		a.meow();
		a.moo();
	}
}
