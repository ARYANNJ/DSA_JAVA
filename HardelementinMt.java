package java;
import java.lang.annotation.Target;
import java.util.*;
public class HardelementinMt {
    public static int findPeakElement(int[] mtArray) {
        int start=0;
        int end=mtArray.length-1;
        while(start<end){
         int mid=start+(end-start)/2;
         if(mtArray[mid]>mtArray[mid+1]){
            end=mid;
        }else{
            start=mid+1;
        }
       
    }
 return end;
}
      
   static int search(int[] mtArray){
    int peak=findPeakElement(mtArray);
    int firstTry=binarySearch(mtArray, 23, 0, peak);
         if(firstTry !=-1){
           return firstTry;
         }
            return binarySearch(mtArray, 23, peak, mtArray.length-1);
   }
   
   
   
   static int binarySearch(int[] mtArray, int target, int start, int end) {
    // find whether the array is sorted in ascending or descending
    boolean isAsc = mtArray[start] < mtArray[end];

    while(start <= end) {
        // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start) / 2;

        if (mtArray[mid] == target) {
            return mid;
        }

        if (isAsc) {
            if (target < mtArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > mtArray[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}




    public static void main(String[] args) {
        int[] mtArray={22,33,44,55,43,34,23,10};
   
       System.out.println(search(mtArray));
    }
}
