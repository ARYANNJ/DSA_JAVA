package java;
import java.util.*;
import java.util.Arrays;
public class twoDBinarySearch {
public static int printArray(int[][] arr){
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
   }
    return -1;
}
public static int search(int[][] arr,int target){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
           if(arr[i][j]==target){
            System.out.println("["+i+","+j+"]");
           }
        } 
       }
        return -1;

}
public static int[] binarySearch(int[][] arr,int target){
    int r=0;
    int c=arr.length-1;
    while(r<arr.length && c>0){
        if(arr[r][c]==target){
         return new int[]{r,c};
        }else if (arr[r][c]<target){
            r++;
        }else{
            c--;
        }
    }
    return new int[]{-1,-1};
}

    






    public static void main(String[] args){
        int [][] arr={
              {1,2,3,4},
              {5,6,7,8},
              {9,10,11,12}

        }; 
        printArray(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Target: ");
        int target=sc.nextInt();
       
        System.out.println( Arrays.toString(binarySearch(arr, target))); 
    }
}
