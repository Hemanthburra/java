package basic_syntax.collections;

import java.util.*;

public class stackMethods {
	public static void main(String args[]) {
		// Last in First Out
		// Stack methods:
		
		Stack<Integer> s = new Stack<>();
		
		// pushing values
		s.push(10);
		s.push(1);
		s.push(4);
		s.push(1);
		s.push(9);
		s.push(5);
		System.out.println(s); //[10, 1, 4, 1, 9, 5]
		
		//poping values
		s.pop(); // removes the top which is last element
		System.out.println(s); // [10, 1, 4, 1, 9]
		
		// peek value or top value
		System.out.println(s.peek()); // 9
		
		//search
		System.out.println(s.search(10)); // index based 1
		// o/p: 5 // [10, 1, 4, 1, 9]
		
		// it is extenstion of the vector class
		// so it as the all the methods of the vector
		
		Stack<String>vpp = new Stack<>();
		Stack<String>vec = new Stack<>();
		
		vpp.add("hemanth");
		vpp.add(0,"vicky"); // adding at index 0
		vec.add("hello");
		vpp.add("hemanth");
		vpp.add(0,"vicky"); // adding at index 0
		vec.add("hello");
		vpp.add("hemanth");
		vpp.add(0,"vicky"); // adding at index 0
		vec.add("hello");
		vpp.addAll(vec);
		vpp.addAll(0, vec); // adds the meant array from the mentioned index
		System.out.println(vpp);
		//getting by index
		vpp.get(0); // returns the 0th index
		
		//size and capacity
		vpp.capacity(); // intial it is 10 and increases double of the current size
		vpp.size();
		
		//removing
		vpp.remove("hemanth");
		vpp.remove(0); // removes the 0th index
		vpp.removeAll(vec); // removes all the elements of vec in vpp
		System.out.println(vpp);
		// clearing;
//		vpp.clear();
		
		// Check if there or not there
		vpp.contains("vicky");
		vpp.containsAll(vec); // check for every element of vec in the vpp
		
		// setting the index metioned values
		vpp.set(0, "Naresh");
		
		//finding the indexs of element
		vpp.indexOf("vicky");
		vpp.lastIndexOf("vicky");
		
		//checking if empty
		vpp.isEmpty();
		 
		// converting the vector to array
		vpp.toArray();
		System.out.println(vpp);
		
		
	}
}
