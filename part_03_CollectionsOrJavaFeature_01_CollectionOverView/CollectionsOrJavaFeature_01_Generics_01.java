package part_03_CollectionsOrJavaFeature_01_CollectionOverView;


public class CollectionsOrJavaFeature_01_Generics_01 {
	
	//below class is not working without static learn why? and put ans over here
	static class Pair< T, S >{
		
		T x;
		S y;
		
	}
	public static void main(String[] args) {
		
		Pair<Integer, String> p = new Pair<>();
		
		p.x=12;
		p.y="Gyan";
		
		//we'll get compile time error error for below line
		//String str = (String)p.x; 
		
		System.out.println(p.x+" "+p.y);
		
	}

}
