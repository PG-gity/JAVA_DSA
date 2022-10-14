package part_02_DSA_03_Recursion;


/*Problem Statement:
 * A rope of length n is going to be cut using some fixed length say a b c,
 * What should be maximum no of cuts?
 */
//import java.math.*;
public class Recursion_08_CutRope_MaximumNoOfPiecesUsingConstraints {
	
	private static int cutRope(int size,int cut1,int cut2,int cut3) {
		if(size==0)
			return 0;
		if(size<0)
			return -1;
			
			 //Math.max Only compares two values so for 3: Max( n1, Max(n2,n3) )
		int result=Math.max(cutRope(size-cut1,cut1,cut2,cut3),
						Math.max(cutRope(size-cut2,cut1,cut2,cut3),
								cutRope(size-cut3,cut1,cut2,cut3)));
		
		// To handle corner cases like result=-1 if we add +1 it will become valid cut(i.e. 0)
		if(result==-1)
			return -1;
		
		return result+1;
	}
	
	public static void main(String args[]) {
		
		// rope size
		int size=23;
		
		//3 possible cuts
		int cut1=11;
		int cut2=9;
		int cut3=12;
		
		System.out.println(cutRope(size,cut1,cut2,cut3));
	}
}
