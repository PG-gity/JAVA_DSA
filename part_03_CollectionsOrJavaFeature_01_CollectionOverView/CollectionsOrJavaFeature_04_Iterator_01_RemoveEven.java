package part_03_CollectionsOrJavaFeature_01_CollectionOverView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsOrJavaFeature_04_Iterator_01_RemoveEven {
									// use <?> for any data type
	static void removeEven(Collection<Integer> c) {
			// use <?> for any data type
		Iterator<Integer> it = c.iterator();
	
			while(it.hasNext()) {
			
			int x= it.next(); //2 work: give next and it++
			
			if(x%2==0)
			it.remove(); //removes previous
		}
	}
	public static void main(String[] args) {

		ArrayList<Integer> coll = new ArrayList<>();

		coll.add(10);
		coll.add(15);
		coll.add(20);
		coll.add(17);

		removeEven(coll);

		System.out.println(coll);

	}
}
