package playgroundgcc.overload;

public class Over {
	public static void doEr() {
		A a = new B();
		a.method();
	}
}

class A {
	static void method() {
		System.out.println("A");
	}
}

class B extends A {
	protected static void method() {
		System.out.println("A e B");
	}
}
