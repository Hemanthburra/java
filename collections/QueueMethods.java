package basic_syntax.collections;

import java.util.*;

public class QueueMethods {

	public static void main(String[] args) {
		// Queue is based on the First in First out
		// there are 3 types in Queue :
		// Priority_Queue
		
		//ArrayQueue:
		// we can access the both first and last elements we can add or pop
		
		// queue works on insertion order not like Priority Queue
		
		Queue<Integer> q = new ArrayDeque<>();
		
		//adding elements
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(10);
		q.add(45);
		
		//peek
		q.peek();
		
		//poll
		q.poll();
		
		//remove
		q.remove(1);
		
		//size()
		q.size();
		
		
		//deque :
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		//adding
		que.add(1);
		que.addFirst(2);
		que.addLast(10);
		que.offer(90);
		que.offerFirst(12);
		que.offerLast(23);
		
		//peak
		que.peek();
		que.peekFirst();
		que.peekLast();
		
		//poll
		
		que.poll();
		que.pollFirst();
		que.pollLast();
		
		//remove
		que.remove();
		que.removeFirst();
		que.removeLast();
		
		//contains
		que.contains(23);
		//containsAll
		
		//clear() , size() , isEmpty();
		
		System.out.println(que);
		
		
		
		

	}

}
