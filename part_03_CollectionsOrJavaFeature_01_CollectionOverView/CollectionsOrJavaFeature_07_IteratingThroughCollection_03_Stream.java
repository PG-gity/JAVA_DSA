package part_03_CollectionsOrJavaFeature_01_CollectionOverView;

import java.util.*;

public class CollectionsOrJavaFeature_07_IteratingThroughCollection_03_Stream {

	
	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(3,10,15,7,20,40,75);
		
		al.stream().filter(x->x>5)
				   .filter(x->x%2!=0)
				   .forEach(x->System.out.println(x));
		
//		Integer arr[] = new Integer[al.size()];
//		
////		try to assign al values to arr using filter
//		arr = al.stream().forEach();
	}
}
