package playgroundgcc.overload;

public class MethodOver {

	public static void tester() {
		Animal dog = new Dog();
		
	}
	
}

class Animal{
	static{System.out.println("nada");}
	public Animal() {
		System.out.println("animal");
	}
	void run() {
		System.out.println("RUN");
	}
}

class Dog extends Animal{
	{System.out.println("Sim");}
	
	public Dog() {
		System.out.println("dog");
	}
	
	public void run() {
		System.out.println("DOG RUN");
	}
	
	public void sound() {
		System.out.println("bark");
	}
}
