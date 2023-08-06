
import java.util.*;
public class allSortAlgo {
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
    }
    public static int max(int[] arr,int start,int end){
       int max=start;
       for(int i=0;i<=end;i++){
        if(arr[i]>arr[max]){
            max=i;
        }
       }
        return max;
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                   swap(arr, j, j+1);
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++)
       {
        int last=arr.length-i-1;
        int maxNumber=max(arr, 0,last);
         swap(arr, maxNumber, last);
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
        }
        public static int cyclicSort(int[] nums){
            int i=0;
            while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        return -1;
        }
    









    public static void main(String[] args) {
        int[] arr={2,55,23,45,89,2,3,4,5,56,76};
        int[] nums={2,5,4,3,1,};
     System.out.println(Arrays.toString(nums));
    cyclicSort(nums);
    System.out.println(Arrays.toString(nums));
    
    }
}
