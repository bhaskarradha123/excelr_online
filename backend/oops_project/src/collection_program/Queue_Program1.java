package collection_program;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Program1 {

	/**
	 * Iterable -i
	 *  |   extends
	 *  |
	 * Collection --i 
	 *  | extends
	 *  |
	 * Queue -i              Queue          Queue
	 *  | implements          |               |
	 *  |                     |               |
	 * PriorityQueue --c    LinkedList--c   ArrayDeque-c
	 *
	 */
	public static void main(String[] args) {
	Queue<String>q=new 	PriorityQueue<String>();
//	q.add("Green");
//	q.add("Blue");
//	q.add("Yellow");
//	q.add("Pink");
//	q.add("Green");
	
	System.out.println(q);
	
	
//	String peek = q.peek();//gives the element
//	System.out.println(peek);
//	System.out.println(q);
//	
//	String poll = q.poll();//removes and gives the element
//	System.out.println(poll);
//	System.out.println(q);
	
	String remove=q.remove();
	System.out.println(remove+"removed ");
	System.out.println(q);

	String element=q.element();
	System.out.println(element+"element");
	System.out.println(q);

	
	}
}
