package basic_syntax.collections;

import java.util.*;

public class LinkedLst {
	public static void main(String args[]) {
		// interface like list,queue ,Deque is used to implement LinkedList
		// not synchrozied
		LinkedList<String> vpp = new LinkedList<>();
		LinkedList<String> vec = new LinkedList<>();
		
		//System.out.println(); of all the below methods to see the output
		//adding
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
		
		//getting by index
		vpp.get(0); // returns the 0th index
		
		//size and capacity
//		vpp.capacity()/; // intial it is 10 and increases double of the current size
		vpp.size();
		
		//removing
		vpp.remove("hemanth");
		vpp.remove(0); // removes the 0th index
		vpp.removeAll(vec); // removes all the elements of vec in vpp
		
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
