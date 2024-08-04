package basic_syntax;


class Test1 {
	public int add() {
		return 3+5;
	}
	public static int sub() {
		return 5-3;
	}
	static int x = 100;
}
public class static_syntax {
	// these are static blocks before class compilation the static blocks are loaded in the memory
	// as we can write as many as we can
	// these will run as the flow of the blocks in the program
	static {
		System.out.println("static3");
	}
	static {
		System.out.println("static1");
	}
	static {	
		System.out.println("static2");
	}
	static {
		System.out.println("static3");
	}
//	static3
//	static1
//	static2
//	static3 is the output for above static block
	{
		System.out.println("non-static block");
		// these will load when we create the object for the class
		// its like constructor
		// but its loads before constructor and after loading non-satic block the constructor in loaded
	}
	public static_syntax() {
		System.out.println("contructor");// after non static block it excutes
	}
	public static void main(String args[]) {
		// static and non-static syntax
		System.out.println(Test1.x);
		System.out.println(Test1.sub()); // we can directly access by using class.method or class.variable
//		System.out.println(new Test1());
		new static_syntax();
	}
	
}
