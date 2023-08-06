package java;
import java.lang.reflect.Array;
import java.util.*;
public class selectionSort{
    //max function
public static int max(int[] arr,int start,int end){
int max=start;
for (int i=start;i<=end;i++){
    if(arr[i]>arr[max]){
        max=i;
    }
}
    return max;
}
static void swap(int[] arr,int first,int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
}
//insertion sort
public static void insertionSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                //swap
                swap(arr, j, j-1);
            }
        }
    }
}
//selection sort
     public static void selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++)
   {
    int last=arr.length-i-1;
    int maxNumber=max(arr, 0,last);
     swap(arr, maxNumber, last);
}
     }
    public static void main(String[] args) {
      int[] arr={22,43,67,23,67,65,41};
     selectionSort(arr);
      System.out.println(Arrays.toString(arr));
}
}