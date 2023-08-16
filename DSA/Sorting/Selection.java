package Sorting;

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_ind=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min_ind]){
                min_ind=j;
               }
            }
            if(min_ind!=i){
                int temp=arr[i];
                arr[i]=arr[min_ind];
                arr[min_ind]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,7,7,8};
        selectionSort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr)); 
    }
}
