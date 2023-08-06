package java;
import java.util.*;
public class mountainArray {
    
    public static int highestNumber(int[]nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=i;
            }else if(nums[max]<nums[max+1])
                return max+1;
            }
            return max;
        }
             
    




    public static void main(String[] args){
        int[] nums={0,10,20,5,2};
      System.out.println(  highestNumber(nums));

    }
}
