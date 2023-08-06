package java;
import java.util.*;
public class rotatedSorted {
    
        public static int search(int[] nums, int target) {
             if (nums == null || nums.length == 0) {
                return -1;
            }
            
            int start = 0;
            int end = nums.length - 1;
            
            while (start < end) {
                
                int middle = start + (end - start) / 2;
                if (nums[middle] > nums[end]) {
                    start = middle + 1;
                }
                else {
                    end = middle;
                }
            }
           
            int pivot = start;
            start = 0;
            end = nums.length - 1;
            
            if (target >= nums[pivot] && target <= nums[end]) {
                start = pivot;
            } else {
                end = pivot;
            }
           
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
            return -1;
        }
    

public static void main(String[] args) {
    int[] nums={6,7,1,2,3,4,5};
    int target;
    System.out.println(search( nums, 3));
}
}





