package java;
import java.util.*;
public class binarySearchAlgo {
    
public static int binarySearch(int[] arr,int Target){
    int start=0;
    int end=arr.length-1;
     
     while(start<=end){
        int mid=start + (end-start)/2;
        if(Target<arr[mid]){
            end=mid-1;
        }else if(Target>arr[mid]){
            start=mid+1;
        }else{
            return mid;
        }
     }
return -1;
}
    public static void main(String[] args){
        int[] arr={23,44,45,56,67,78,89,90};
        Scanner sc =new Scanner(System.in);
        int Target=sc.nextInt();
      System.out.println(binarySearch(arr, Target));  
    }
}
