package java;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class cyclicSort{

public static void binarySearch(int[] arr,int target){
    int start=arr[0];
    int end=arr.length-1;
    for(int i=0;i<arr.length;i++){
        for(int j=start;j<end;j++){
            int mid=start+(end-start)/2;
            if(arr[target]>arr[mid]){
                start=mid+1;
            }else if(arr[target]<arr[mid]){
                end=mid-1;
            }
        }
    }
}



    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8,9};
        int target=6;
        binarySearch(arr, target);
    }
}

