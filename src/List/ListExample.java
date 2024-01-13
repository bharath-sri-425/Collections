package List;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al=new ArrayList<Integer>();
		List<Integer> ll=new LinkedList<Integer>();
		List<Integer> v=new Vector<Integer>();
		Stack<String> st=new Stack<String>();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		Deque<String> dd=new ArrayDeque<String>() ;
			
			
		for (int i=1;i<=10;i++) {
			al.add(i);
			ll.add(i);
			v.add(i);
			pq.add(i);
			
		}
		dd.addFirst("Hi");
		dd.addLast("Bharath");
		System.out.println("Deque :"+dd);
		st.push("Hi ");
		st.push("Bharath");
		System.out.println("PQ POll "+pq.poll());//removing the top element
		System.out.println("PQ List "+pq);		
		System.out.println("PQ PEEK "+pq.peek());//Printing top element
		System.out.println("PQ List "+pq);	
		System.out.println("Array List "+al);
		System.out.println("Linked List "+ll);
		System.out.println("Vector "+v);
		System.out.println("Stack "+st);
		
		Iterator<String> itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
