package DivideAndConquer;

public class mergeSort1 {
    public static void mergeProcedure(int[] arr,int l,int mid,int r){

        int n1=mid-l+1;
        int n2=r-mid;

        int[] lsubarray=new int[n1];
        int[] rsubarray=new int[n2];

        for(int i=0;i<n1;i++){
          lsubarray[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
          rsubarray[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k]=lsubarray[i];
                i=i+1;
            }
            else{
                arr[k]=rsubarray[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<n1){
            arr[k]=lsubarray[i];
            i=i+1;
            k=k+1;
        }
        while(j<n1){
            arr[k]=rsubarray[j];
            j=j+1;
            k=k+1;
        }
    }
    public static void mergeSort(int[] arr,int i,int j){
        if(i<j){
            int mid=i+(j-i)/2;

            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);

            mergeProcedure(arr,i,mid,j);
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
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting");
        printArr(arr,n);
    }
}