package java;
import java.util.Arrays;
import java.util.*;
public class binarySearch {
    public static int binarySe(int[] arr,int Target){
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
 public static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    // printArray(arr);
 }


    public static void main(String[] args){
        int[] arr={22,44,55,88,66,5,9};
        Scanner sc=new Scanner(System.in);
        bubbleSort(arr);
        System.out.println("Enter Target");
        int Target=sc.nextInt();
       System.out.println(binarySe(arr, Target)); 
        
    }
}
