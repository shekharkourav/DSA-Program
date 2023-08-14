package IMPQ;

public class Squarroot {
    public static int findSqRoot(int num){
       int low=0,high=num,res=-1;
       while(low<=high){
         int mid=low+(high-low)/2;
         int val=mid*mid;
         if(val==num)return mid;
         else if(val<num){
            res=mid;
           low=mid+1;
          }
         else high=mid-1;
        }
       return res;
    }
    public static void main(String[] args) {
        int i=15;
        int root=findSqRoot(i);
        System.out.println("Squre Root is:"+root);
    }
}
