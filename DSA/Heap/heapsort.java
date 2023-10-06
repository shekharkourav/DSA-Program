package heap;

//import java.util.PriorityQueue;

public class heapsort {
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int leftIdx=2*i+1;
        int rightIdx=2*i+2;
        if(leftIdx<n && arr[leftIdx]>arr[largest]){
            largest=leftIdx;
        }
        if(rightIdx<n && arr[rightIdx]>arr[largest]){
            largest=rightIdx;
        }
        if(largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;

            heapify(arr, n,largest);
        }
    }
    public static void builHeap(int[] arr,int n){
        int startIdx=n/2-1;
        for (int i = startIdx; i>=0;i--) {
            heapify(arr,n,i);
        } 
    }
    public static void HeapSort(int[] arr,int n){
        builHeap(arr, n);
        for (int i=n-1;i>=0;i--) {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            heapify(arr,i,0);
        }
    }
    public static void displayHeap(int[] arr,int n){
        System.out.println();
        System.out.print("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       // PriorityQueue p=new PriorityQueue<>();
        
        int[] arr={5,7,8,3,9,1,4};
        int n=arr.length;
        HeapSort(arr,n);
        displayHeap(arr,n);
    }
}
