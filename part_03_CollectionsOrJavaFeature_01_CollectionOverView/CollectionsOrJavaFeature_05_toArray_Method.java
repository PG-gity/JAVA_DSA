package part_03_CollectionsOrJavaFeature_01_CollectionOverView;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOrJavaFeature_05_toArray_Method {


	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(20);

		
		Object []arr = list.toArray();
		//Problem: can't convert to integer array without type casting each and every element
//		Integer []array = list.toArray();
		
		for(Object o:arr)
			System.out.print(o+" ");
		
		//To convert Integer type array
		Integer []array = new Integer[list.size()];
		array = list.toArray(array);
		
		System.out.println();
		System.out.println("Converted to integer");
		
		for(Object o:array)
			System.out.print(o+" ");
	}
}
