package part_03_CollectionsOrJavaFeature_12_HashMap_And_LinkedHashMap;

import java.util.*;


class Pair{
	int elem;
	int value;
	Pair(int e,int v){
		this.elem=e;
		this.value=v;
		
	}
}

public class HashMap_And_LinkedHashMap_01_FrequencyOfArrayElement {

//Using map collection's functions	
	public static void printFreqAndElem(int[] arr){
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			//map.put(Integer key,Integer value)
							    //Integer value : map.getOrDefault(Object key, Integer DefaultValue)
															//check if value is present at arr[i] and add +1 to that 
															//Or if not present then pass default value 0 and add +1
			
			map.put(arr[i], (map.getOrDefault(arr[i], 0)+1) );
			
		}
		
		
//		Collections.sort(map, (v1,v2)->(map.get(v1) -map.get(v2)));
		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(map.get(arr[i]) != -1) {
//				System.out.println("Elem : "+arr[i]+" Value : "+map.get(arr[i]));
//				map.put(arr[i], -1);
//			}
//		}
		
		ArrayList<Pair> arrAsLst = new ArrayList<>();
		
//		for(Integer key: map.keySet()) {
//			
//			int val = map.get(key);
//			
//			arrAsLst.add(new Pair(key,val));
//		}
		
		//Above for loop 
		//Or as below :
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			
			arrAsLst.add(new Pair(entry.getKey(),entry.getValue()));
			
		}
		
		
//		for(Pair p: arrAsLst)
//			System.out.println("Before Sort:  Elem: "+p.elem+" Value: "+p.value);
		
		//To sort according to value
		Collections.sort(arrAsLst, (v1,v2) -> v1.value-v2.value);
		
		
//		for(Pair p: arrAsLst)
//			System.out.println("After Sort:  Elem: "+p.elem+" Value: "+p.value);
		
	}

	

//Using Stream But this is Map not HashMap
//	public static void printFreqAndElem(Integer[] arr) {
//		Map<Integer,Long> m = Arrays.stream(arr)
//				.collect(Collectors
//						.groupingBy(element -> element,
//								Collectors.counting()));
//		System.out.println(m);
//	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,2,3,3};
		
		printFreqAndElem(arr);
		
	}

}
