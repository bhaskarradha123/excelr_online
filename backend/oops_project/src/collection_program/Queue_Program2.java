package collection_program;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue_Program2 {

	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(10);
		pq.add(30);
//		pq.add(null);
		System.out.println(pq);
		System.out.println(pq.poll());//10
		
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(null);
		System.out.println(li);
		System.out.println(li.poll());//20
		
		
		ArrayDeque<Integer>ad=new ArrayDeque<Integer>();
		ad.add(20);
		ad.add(10);
		ad.add(30);
//		ad.add(null);
		System.out.println(ad);
		System.out.println(ad.poll());
		
	}
}


















