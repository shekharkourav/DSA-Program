package Searching;
//time complexity is:O(n);
//space complexity is:O(1);
public class linsearch{
    public static void main(String[] args) {
        int array[]={5,4,8,7,6,2,9};
        int a=45;
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(a==array[i]){
               index=i;
            }
        }
        if(index==-1)System.out.println("Element not found");
        else System.out.println("Element found at index no:"+index);   
    }
}