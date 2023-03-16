package part_03_CollectionsOrJavaFeature_01_CollectionOverView;

public class CollectionsOrJavaFeature_01_Generics_02_GenericsFunction {
	
	//need to mention <T,S> to make aware compiler about  we are going to use a generic data type 
	public static <T,S> int count(T arr[],T x,S n) {
		
		int res=0;
	
		
		for(T e: arr)
			
			if(e.equals(x))
				
				res++;
		
		System.out.println(n+"'s Code returns:");
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= {10,20,30,40,10,30};
		
		String str="Gyan";
		System.out.println(count(arr,10,str));
		
	}

}
