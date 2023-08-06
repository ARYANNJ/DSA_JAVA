package java;
import java.util.*;


public class maxItemArray{

    public static void main(String[] args) {
        int[] arr={2,5,4,33,655,22,90};
        System.out.println( max(arr));
    }

   public static int max(int[] arr){
    int maxVal=arr[0];
    for(int i=1;i<arr.length;i++){
    if(arr[i]>maxVal){
     maxVal=arr[i];
    }
    }
    return maxVal;
   }
}