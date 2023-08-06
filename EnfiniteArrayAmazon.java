package java;
import java.util.*;
public class EnfiniteArrayAmazon {
        public static int binarySearch(int[] nums,int target,int start,int end){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }else if(target>nums[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }
            }
            return -1;
        }
      public static int findingRange(int[] nums,int target){
       int start=0;
       int end=1;
       //imp part
       while(target>nums[end]){
        int newStart=end+1;
        end=end+(end-start+1)*2;
        start=newStart;

       }
       return binarySearch(nums, target, start, end);
      }


    public static void main(String[] args){
      int[] nums={2,33,44,55,67,78,88,89,93,94,96,98,100,101,132,145,165};
      Scanner sc=new Scanner(System.in);
      int target=sc.nextInt();
      System.out.println(findingRange(nums, target));
    }
}
