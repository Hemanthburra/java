package basic_syntax;

import java.util.Arrays;

public class strings_methods {

	public static void main(String[] args) {
		String s = new String("hello world!");
		String s2 = "hello world";
//		String methods:
//			startsWith()
		System.out.println(s.startsWith("h")); // returns bool
//			endWith()
		System.out.println(s.endsWith(".")); // returns bool
//			contains()
		System.out.println(s.contains("e")); // returns bool
//			equals()
		System.out.println(s.equals(s)); // returns true
//			equalsIgnoreCase()
		System.out.println(s == s2); // returns false
//			length()
		System.out.println(s.length()); // returns length
//			toUpperCase()
		System.out.println(s.toLowerCase()); // returns lower case of the string
//			toLowerCase()
		System.out.println(s.toUpperCase()); // returns upper case of the string
//			toCharArray()
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch)); // returns the array of charcters in the string
//			indexOf()
		System.out.println(s.indexOf("l")); // returns the index of the character -> first character from the start
//			lastIndexOf()
		System.out.println(s.lastIndexOf("l")); // returns the index of the charcter from the last
//			subString()
		System.out.println(s.substring(2,7)); // returns the substring from 2nd index to 7-1th index in the s string
//			split()
		String[] x = s.split(" ");
		System.out.println(Arrays.toString(x));
//			charAt()
		System.out.println(s.charAt(0)); // returns the 0th index character in the string
//		replace() , replaceAll() -- > replaces all teh instances in teh string
		System.out.println(s.replace("world", "universe")); // replaces the worlds
		System.out.println(s.replace("ll", "ii")); // replaces the characters also
//		trim()
		String k = "      resign     ";
		System.out.println(k.trim());
//		Interger.valueOf()
		String num = "123";
		System.out.println(Integer.valueOf(num)); // prints the number in int datatype
//		String.valueOf()
		int number = 123;
		System.out.println(String.valueOf(number)); // prints the string datatype of number int
//		isEmpty() , isBlank()
		String name1 = "";
		String name2 = "  ";
		System.out.println(name1.isBlank()); // returns true
		System.out.println(name1.isEmpty()); // returns true
		
		System.out.println(name2.isBlank()); // returns true
		System.out.println(name2.isEmpty()); // returns false bcz it as space character in it
		
//		String k = "vickyhemanth";
		
	}

}
