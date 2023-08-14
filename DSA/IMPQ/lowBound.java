package IMPQ;

import java.util.Arrays;

public class lowBound{
    public static int lowerb(int a,int array[]){
      int low=0,high=array.length-1,res=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(array[mid]==a){
            res=mid;
            high=mid-1;
        }
        else if(array[mid]<a){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
    return res;
    }
    public static void main(String[] args) {
        int array[]={12,12,12,};
        Arrays.sort(array);
        int a=12;
        int index= lowerb(a,array);
        if(index==-1)System.out.println("Element not found");
        else System.out.println("Element found at index:"+index);  
    }
}
