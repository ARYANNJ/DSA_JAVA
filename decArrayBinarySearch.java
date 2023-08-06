package java;
import java.util.*;


public class decArrayBinarySearch{


    public static int binarySearch(int[] arr,int Target){
          int start=0;
          int end=arr.length-1;
         while(start<=end){
            int mid=start+(end+start)/2;
            if(Target<arr[mid]){
                end=mid-1;
            }else if(Target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
         }
        return start;
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={22,33,45,67,89,99};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Target Number:");
        int Target=sc.nextInt();
   System.out.println(binarySearch(arr, Target));
    }
}