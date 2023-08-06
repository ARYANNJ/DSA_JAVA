import java.util.*;

class Solution {
    public static int findDuplicate(int[] nums){
            int i=1;
            while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,  i, correct);
            }else{
                i++;
            }
        }
        return -1;
        }
    

   static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,2,5,2};
        findDuplicate(nums);
        System.out.println(Arrays.toString(nums));
    }
}