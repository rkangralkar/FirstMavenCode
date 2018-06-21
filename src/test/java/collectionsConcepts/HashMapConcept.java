package collectionsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "java");
		hm.put(2, "tahul");
	
		hm.put(3, "sdfg"); 
		hm.put(4, "jadfgva");
		
		
		hm.put(5, "jasdrgsva");
		
		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println("Key is "+m.getKey()+ " and value is "+m.getValue());
		}
		
		hm.remove(4);
		System.out.println(hm.get(1));
		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println("Key is "+m.getKey()+ " and value is "+m.getValue());
		}
		
		hm.put(10, "collections");
		System.out.println("**********************");
		hm.replace(5, "hello");
		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println("Key is "+m.getKey()+ " and value is "+m.getValue());
		}
		
		
		
	}
	
	

}
