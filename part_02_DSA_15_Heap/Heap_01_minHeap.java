package part_02_DSA_15_Heap;


public class Heap_01_minHeap {
	public static class MinHeap{
		int arr[];
		int size, capacity;
		
		MinHeap(int c){
			size=0;
			capacity=c;
			arr = new int[c];
		}
		int left(int i) {
			return (2*i+1);
		}
		int right(int i) {
			return (2*i+2);
		}
		int parent(int i) {
			return ((i-1)/2);
		}
		public void insert(int x) {
			if(size==capacity)
				return;
			size++;
			arr[size-1]=x;
			
			for(int i=size-1;i!=0 && arr[parent(i)]>arr[i];) {
				int temp=arr[parent(i)];
				arr[parent(i)]=arr[i];
				arr[i]=temp;
				i=parent(i);
				
			}
			
			
		}
		public void print() {
			for(int i:arr) {
				System.out.println(i);
			
	        }
		}
	

	}

	public static void main(String []args) {
		
		MinHeap h= new MinHeap(11);
		
		h.insert(3);
		h.insert(2);
		h.insert(15);
		h.insert(20);
		
		h.print();
		
		
		
	}

}
