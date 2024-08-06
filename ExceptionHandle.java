package basic_syntax;

public class ExceptionHandle {

	public static void main(String[] args) {
		//checked exceptions  -> runtime exceptions
		//unchecked exceptions -> compile time exceptions
		//stacktrace :
		//	exception name
		// 	exception message
		//	which line number
		//	method info
		
		
		/*
		 * Family of the exceptions:
		 * Object
		 * 	Throwable
		 * 		Exception
		 * 			Runtime Exception
		 * 				// these are the unchecked exceptions rather than this all are checked exceptions
		 * 				IndexOutOfBound Exception
		 * 				Arthematic Exception
		 * 				NullPointer Exception
		 * 			IO Exception
		 * 				FileNotFound Exception
		 * 			SQL Exception
		 */
		int x = 1;
		
		try {
			System.out.println(x/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()); // :  / by zero
			System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
			e.printStackTrace();
			throw e; // user throwing the error to the java 
		}
		finally {
			System.out.println("Code Excuted");
		}
		
		
		

	}

}
