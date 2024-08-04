package basic_syntax;

// In java we can't use multiple inheritance i.e, one class can't inherit the 2 classes
//single
//multi level
//hybrid
//hierarchial

// these is the example of multi level  inheritance

class Guest{
	public void read() {
		System.out.println("I'm guest - Guest");
	}
}

class Developer extends Guest{
	public void write() {
		System.out.println("I'M develper - writing");
	}
}

class Admin extends Developer{
	
	public void manage() {
		super.write(); // parent class write method is excuted
		write(); // local write method is excuted
		System.out.println("Admin - Managing");
	}
	
	public void write() { // locally it will check if there is not there then it will go to the parent class
		System.out.println("I'm Admin writing");
	}
}

public class inheritance_syntax {

	public static void main(String[] args) {
		Admin a = new Admin();
		// these methods first check in the object created class if there is not there in the class 
		// then it will go to the parent classes and checks for the method.
		a.read(); // access the guest class method
		a.manage(); // access the admin class method
		a.write(); // access the admin class method
//		ouput : 
//		I'm guest - Guest
//		I'm Admin writing
//		Admin - Managing
//		I'm Admin writing

	}

}
