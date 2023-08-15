package Sorting;

import java.util.Arrays;

public class Insertion{
    public  static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    
                    j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1};
      insertionSort(arr);
      System.out.println("Sorted Array");
      System.out.println(Arrays.toString(arr)); 
    }
}