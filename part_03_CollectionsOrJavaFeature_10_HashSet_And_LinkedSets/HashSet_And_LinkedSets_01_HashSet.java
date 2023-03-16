package part_03_CollectionsOrJavaFeature_10_HashSet_And_LinkedSets;

import java.util.*;

public class HashSet_And_LinkedSets_01_HashSet {

	public static void main(String[] args) {
		HashSet<String> h  = new HashSet<>();
		
		h.add("Gyan");
		h.add("IDE");
		h.add("Power");
		
		System.out.println(h);
		System.out.println(h.contains("Power"));
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		
		System.out.println("\n"+h.isEmpty());
	}
}
