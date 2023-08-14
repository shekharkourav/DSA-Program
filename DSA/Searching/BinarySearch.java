package Searching;

import java.util.Arrays;

public class BinarySearch {
    public static int inarySearch(int a,int array[]){
      int low=0,high=array.length-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(array[mid]==a){
            return mid;
        }
        else if(array[mid]<a){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
    return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,2,3,3,4,5,6,6,7,};
        Arrays.sort(array);
        int a=22;
        int index= inarySearch(a,array);
        if(index==-1)System.out.println("Element not found");
        else System.out.println("Element found:"+index);  
    }
}
