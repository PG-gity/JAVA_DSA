package part_03_CollectionsOrJavaFeature_01_CollectionOverView;


class MyGen<T>{
	
	T x;
	static int count;
	
	MyGen(){
		count++;
	}
	
}
public class CollectionsOrJavaFeature_01_Generics_03 {

	public static void main(String[] args) {
		
		MyGen<Integer> m1 = new MyGen<>();
		MyGen<String> m2 = new MyGen<>();
		
		System.out.println(MyGen.count);
	}

}
