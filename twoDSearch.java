package java;
import java.lang.annotation.Target;
import java.util.*;
public class twoDSearch {
    

     public static void findIndex(int[][]arr,int Target){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             if(arr[i][j]==Target){
                System.out.println("Target found at:"+i+","+j);
             }
            }
         }
     }


    public static void main(String[] args) {
        int[][] arr={
            {-2,33,44},
            {55,-1,77},
            {44,5,66}

  };
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Target to find:");
 int Target=sc.nextInt();
  findIndex(arr, Target);
    }






}
