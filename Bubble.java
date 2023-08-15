package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public  static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean s=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    s=true;
                }
            }
            if(s==false){
             break;
            }
        }
    }
    public static void main(String[] args) {
      int[] arr={2,4,8,5,7,7,1,3,};
      bubbleSort(arr);
      System.out.println("Sorted Array");
      System.out.println(Arrays.toString(arr));  
    }
}
