public class A {
	public final double PI = 3.14;
	public  void method(){
		System.out.print("A");
	}
}

public class B extends A {
	// overloading
	void method(char letter){
		System.out.print("B " + letter);
	}
}

public class C extends B {
	// overriding
	void method(char letter){
		System.out.print("C " + letter);
	}
	// overriding
	void method(){
		System.out.print("C");
	}
}
