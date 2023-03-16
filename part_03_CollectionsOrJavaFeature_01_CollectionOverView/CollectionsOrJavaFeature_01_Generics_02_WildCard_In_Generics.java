package part_03_CollectionsOrJavaFeature_01_CollectionOverView;

import java.util.*;

//Ref: p3_L01 : 00:27:07

class Student{
	
	
}
class EnggStudent extends Student{
	
	
}

public class CollectionsOrJavaFeature_01_Generics_02_WildCard_In_Generics {

	public static void main(String[] args) {

/*Need of WildCards		

		//general structure without using features
		Student s1 = new Student();
		EnggStudent eS1 = new EnggStudent();
		
		s1 = eS1; //Inheritance: Completely OK to parent ref(student) refer to a child ref(EnggStudent) 
		
		//Let's use java Collections/feature and Inheritance
		ArrayList<Student> sAl = new ArrayList<>();
		ArrayList<EnggStudent> eSAl = new ArrayList<>();
		
		sAl =eSAl; //<Compiler Error>Unable to use inheritance using Collection / feature
		
*/
		
		//Use : "?" WildCard <unknown type>
		ArrayList<?> sAl1= new ArrayList<>();
		ArrayList<EnggStudent> eSAl1 = new ArrayList<>();
		
		sAl1 = eSAl1; //Now fine
		
		//We can bound(Upper Bond) that only student and their descendants can refer 
		ArrayList<? extends Student> sAl2 = new ArrayList<>();
		ArrayList<EnggStudent> eSAl2 = new ArrayList<>();
		
		sAl2 = eSAl2;
		
		//Lower bound
		ArrayList<? super Student> sAl3 = new ArrayList<>();
		ArrayList<Object> ObjAl3 = new ArrayList<>();
		
		
		sAl3=ObjAl3;
	}

}


