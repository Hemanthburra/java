package basic_syntax.collections;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// In COLLECTIONS Interface  there is collection interface and map interface
		// In collections there are three:
		// List interface
		// Queue interface
		// set interfaces
		
		// In list interface there are 3 classes:
		// ArrayList
		// vector
		// LinkedList
		
		// Vector Class:
		// Intial capacity 10 size
		Vector<String> vpp = new Vector<>();
		Vector<String> vec = new Vector<>();
		
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
		vpp.capacity(); // intial it is 10 and increases double of the current size
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
		
		// ArrayList class:
		//same methods like vector in arraylist -->no capacity
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("hemanth");
		arr.add(0,"vicky"); // adding at index 0
		arr.add("hello");
		arr.add("hemanth");
		arr.add(0,"vicky"); // adding at index 0
		arr.add("hello");
		arr.add("hemanth");
		arr.add(0,"vicky"); // adding at index 0
		arr.add("hello");
		arr.addAll(vec);
		arr.addAll(0, vec); // adds the meant array from the mentioned index
		
		//getting by index
		arr.get(0); // returns the 0th index
		
		//size and capacity
//		arr.capacity(); // intial it is 10 and increases double of the current size
		// initial size is 0 if any 1 element is added it becomes 10
		// increase by 50% of the current size when the capacity is over to add elements
		arr.size();
		
		//removing
		arr.remove("hemanth");
		arr.remove(0); // removes the 0th index
		arr.removeAll(vec); // removes all the elements of vec in vpp
		
		// clearing;
//		arr.clear();
		
		// Check if there or not there
		arr.contains("vicky");
		arr.containsAll(vec); // check for every element of vec in the vpp
		
		// setting the index metioned values
		arr.set(0, "Naresh");
		
		//finding the indexs of element
		arr.indexOf("vicky");
		arr.lastIndexOf("vicky");
		
		//checking if empty
		arr.isEmpty();
		 
		// converting the vector to array
		arr.toArray();
		System.out.println(vpp);
		
		

	}

}
