package basic_syntax.collections;

import java.util.*;

public class priorityQueueMethods {
	
	public static void main(String[] args) {
		//by default min heap is used
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//default and initial capacity of pq is 11
		
		//adding elements
		pq.offer(1);
		pq.add(2);
		pq.add(3);
		pq.add(10);
		pq.add(5);
		pq.add(18);
		pq.add(2);
//		pq.addAll(0);
		System.out.println(pq);
		
		//peek
		pq.peek(); // returns the head
		
		//poll
		pq.poll(); // remove the head
		
		//remove
		pq.remove();// if empty this will throw an exception
		
		//contains
		pq.contains(3); // returns bool
		
		//isEmpty()
		pq.isEmpty();
		
		//clear()
		pq.clear();
		
		//for max heap
		PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
		//these is used for max heap
		
	}
}
