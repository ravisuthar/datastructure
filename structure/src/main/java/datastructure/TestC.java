package datastructure;

class A {

	static void test() {
		System.out.println("A");
	}

}

class B extends A {
	static void test() {
		System.out.println("B");
	}

	void get() {
		System.out.println("B get");
	}
}

public class TestC {
	public static void main(String[] args) {
		A a = new B();
		a.test();
	}
}
