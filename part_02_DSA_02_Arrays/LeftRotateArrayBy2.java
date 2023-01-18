package part_02_DSA_02_Arrays;



public class LeftRotateArrayBy2 {
    static void rotateArr(int arr[], int d, int n)
    {
        int tempArr[]= new int[d];
        for(int i=0;i<tempArr.length;i++){
            tempArr[i]=arr[i];
        }
        for(int i=0;i<(arr.length-d);i++){
            
            arr[i]=arr[d+i];
        }
        for(int i=0;i<tempArr.length;i++){
            
            arr[arr.length-d+i]=tempArr[i];
            
        }
        
    }
	public static void main(String[] args) {
		
	}

}
