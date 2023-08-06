package java;
import java.util.*;
public class findMin {
      public static void findMinNo(int[][] arr){
        int min=arr[0][0];
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
           { if(arr[i][j]<min){
                min=arr[i][j];
            }
}
        }
        System.out.println(min);
      }



public static void main(String[] args){
    int[][] arr={
              {-2,33,44},
              {55,-1,77},
              {44,5,66}

    };
    findMinNo(arr);
}

}
