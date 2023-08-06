package java;
import java.util.*;
public class multiDimArray {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int[][] matrix=new int[3][3];
   for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){
     matrix[i][j]=sc.nextInt();
    }
    
 
}for(int i=0;i<matrix.length;i++){
    System.out.println(Arrays.toString(matrix[i]));
    }
    System.out.println();
}


}



