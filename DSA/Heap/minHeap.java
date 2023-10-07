package heap;

public class minHeap {
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int leftIdx=2*i+1;
        int rightIdx=2*i+2;
        if(leftIdx<n && arr[leftIdx]<arr[largest]){
            largest=leftIdx;
        }
        if(rightIdx<n && arr[rightIdx]<arr[largest]){
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
        System.out.print("MaxHeap:");
        for (int i = startIdx; i>=0;i--) {
            heapify(arr,n,i);
        } 
    }
    public static void displayHeap(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        builHeap(arr,n);
        displayHeap(arr,n);
    } 
}
