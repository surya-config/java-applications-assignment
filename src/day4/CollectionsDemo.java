package day4;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// List
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		System.out.println("List: ");
		System.out.println(list+"\n");
		
		// Set
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(30);
		System.out.println("Set: ");
		System.out.println(set+"\n");
		
		// Map
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		Iterator<Map.Entry<Integer,String>> it =  map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println("(Key = "+entry.getKey()+", Value = " +entry.getValue()+")");
		}
	}

}
