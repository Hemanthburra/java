package basic_syntax.collections;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// Map as 1 interface SortedMap
		// HashMap and LinkedHashMap are implements of Map
		// TreeMap is the Implements of SortedMap
		
		// all 3 as same methods but the order of arrangements in the map is different
//		HashMap	HashMap is the implementation of Map, but it doesn't maintain any order.
//		LinkedHashMap	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
//		TreeMap	TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
		
		HashMap<Integer,String> mpp = new HashMap<>();
		
		//putting elements
		mpp.put(0, "vikcy");
		mpp.put(1,"Naresh");
		mpp.put(2, "Fan");
		mpp.put(3, "ryzen");
		
		// returns the keys in a set 
		System.out.println(mpp.keySet());
		
		//for values
		mpp.values();
		
		// accessing the values using keys
		mpp.get(1);
		
		//remove using key
		mpp.remove(2);
		mpp.remove(2,"Fan");
		
		//contains
		mpp.containsKey(1);
		mpp.containsValue("Fan");
		
		//putIfAbesent
		mpp.putIfAbsent(2, "Fan");
		
		//replace
		mpp.replace(2, "Genz");
		
		//size
		mpp.size();
		
		// for all objects in map
		mpp.entrySet();
		System.out.println(mpp.entrySet()); // [0=vikcy, 1=Naresh, 2=Genz, 3=ryzen]
		//by using entryset() we use
		for (Entry<Integer, String> x : mpp.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
//		0 vikcy
//		1 Naresh
//		2 Genz
//		3 ryzen
		
		
		

	}

}
