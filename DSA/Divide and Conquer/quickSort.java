package DivideAndConquer;

public class quickSort {
    public static int partition(int[] arr,int l,int h){
       int i=l;
       int pivot=arr[l];
       
       for(int j=l+1;j<=h;j++){
          if(arr[j]<=pivot){
            i=i+1;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
       }
       int temp=arr[l];
       arr[l]=arr[i];
       arr[i]=temp;

       return i;
    }
    public static void quicksort(int[] arr,int l,int h){
       if(l<h){
        int m=partition(arr,l,h);
        quicksort(arr,l,m-1);
        quicksort(arr, m+1, h);
       }
    }

    public static void printArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={50,20,40,90};
        int n=arr.length;
        System.out.println("Array before sorting");
        printArr(arr,n);
        quicksort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        printArr(arr,n);
    }
}
