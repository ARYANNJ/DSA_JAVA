package java;
import java.util.*;


public class bubQuestions{

   public static void bubbleSort(int[] arr){
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-j-1;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       
      }

      System.out.println(Arrays.toString(arr));
    
   }


    public static void main(String[] args){
        int[] arr={23,43,56,32,12,32,67};
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
    }
}
System.out.println(Arrays.toString(arr));
    }
}