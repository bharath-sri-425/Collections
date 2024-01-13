package List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unordered collection of objects in which duplicate values cannot be stored
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();//It stores the data in (Key, Value) pairs
		for (int i=1;i<=5;i++) {
			hs.add(i);
			lh.add(i);
			ts.add(i);
			}
		hm.put(1, "Hi");
		hm.put(2, "Bharath");
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Hash set :"+hs);
		System.out.println("Linked Hash set :"+lh);
		System.out.println("Hash map :"+hm);
		System.out.println("Hash map :"+hm.get(2));
		for (Map.Entry<Integer, String> e: hm.entrySet()) {
			System.out.println(e.getKey());
		}
	}

}
