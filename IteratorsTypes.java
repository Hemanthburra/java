package basic_syntax;

//import java.util.Enumeration;
import java.util.*;
//import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Vector;

public class IteratorsTypes {

	public static void main(String[] args) {
		/*
		 * There are 3 types of iterators:
		 * 1.Enumeration = legacy classes(HashTable,Stack,Vector,Dictionary,Properties)->1 way
		 * 2.Iterator = New and Legacy Classes - > special permission for removing ->one way
		 * 3.ListIterator = List type collection classes only -> read/write ->2 way
		 */
		
		/*
		 * Enumeration:
		 */
		Vector<String>vpp = new Vector<String>();
		vpp.add("vicky");
		vpp.add("sai");
		vpp.add("dhoom");
		
		Enumeration<String> e = vpp.elements();
		
		//for hash table and properties only values are accessed
		while (e.hasMoreElements()) { // checks there is next element or not
			System.out.println(e.nextElement()); // prints the next element
		}
		
		/*
		 * Iterator
		 */
		Iterator <String> it = vpp.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
//			it.remove(); // remove methods removes the next method pointing element
		}
		/*
		 * we want to use next() method because the remove method dont know about which 
		 * element it wan to remove
		 * 
		 * as well when the next function is used it points the next element until then
		 * the Iterator dont know whether there is another element or not
		 */
//		it.remove();// removes the last element because after the loop the next points to the last element
		System.out.println(vpp);
		
		// in hash table we cant use directly the iteration 
		
		Hashtable<String,Integer> hm = new Hashtable<>();
		
		hm.put("vicky",1);
		hm.put("fan", 90);
		hm.put("fill", 12);
		
		// if we wan to use iterator 
		hm.keySet().iterator();
		Iterator<String> m = hm.keys().asIterator();
		hm.values().iterator();
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		
		//for properties we use
//		prop.elements().asIterator();
		
		/*
		 * ListIterator:
		 * List type of collection options
		 * i.e, List interface
		 * bi-directional
		 * read-write operations
		 * legacy and new classes
		 */
		ListIterator<String> li = vpp.listIterator();
		
		while (li.hasNext()) {
			System.out.println(li.next()); // front traversal
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous()); // back traversal
		}
		
		li.add("guru");// where next or previous points there it is added
		System.out.println(vpp);
//		li.remove(); // same as above in iterators methods
		
		
		
		
		
	}

}
