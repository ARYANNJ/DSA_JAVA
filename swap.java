package java;
import java.util.Arrays;

public class swap {
    ////max function
     static int max(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
     }
    
    ///swap function
    static void swap(int[] arr,int first,int second){
       int temp=arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
}
   ////selection sort
   public static void selectionSort(int[] arr){
     for(int i=0;i<arr.length;i++){
        int last=arr.length-i-1;
        int maxNumber=max(arr, 0, last);
        swap(arr, maxNumber, last);
     }
    }
    public static void main(String[] args) {
        int[] arr={2,3,46,6,7,4};
      selectionSort(arr);
      System.out.println(Arrays.toString(arr));
    }
}
