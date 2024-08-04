package basic_syntax;

import java.util.Arrays;

public class var_syntax {

	public static void main(String[] args) {
		// var is the keyword used as auto in cpp
		// var is used for the local variables
		var i = 20000;
		System.out.println(i);
		var s1 = "vicky";
		System.out.println(s1);
		var b1 = "true";
		System.out.println(b1);
		// var can be used as the variable also java doesn't throw an error
		var var = 10;
		System.out.println(var);
//		System.out.println(var);
//		System.out.println(i);
		 
		// by using var we cant declare the variable in run time (or) by the user 
		// we want to declare them directly
		
		var arr1 = new int[5];
		var arr = new int[] {1,2,3};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr));
		
		//var arr = {1,2,3}; --> it is an error


	}

}
