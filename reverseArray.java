package java;

import java.util.*;
import java.util.Arrays;
public class reverseArray {
    public static void reverserArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
public static void main(String[] args){

    int[] arr={1,2,3,4,5};
   reverserArray(arr);
   System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[]arr ,int index1,int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }



}






