package java;

import java.util.*;




public class findMinRotate {
    public static int findMin(int[] nums) {
        int start=nums[0];
        int min;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<start){
            return i;
           }
       }
        return -1;
}



public static void main(String[] args) {
    int[] nums={4,5,6,7,8,9,0,1,2,3};
    System.out.println("Rotated "+findMin(nums)+"  Times From original");
}




}
