package java;
import java.util.*;
//search for 3 in the index 1 to 4
public class linearSearch{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number To Find");
    int Target=sc.nextInt();
    int[] arr={2,6,4,8,9,34};
    for(int i=0;i<arr.length;i++){
        if(arr[i]==Target){
            System.out.println("The Target is At:"+i);
        }
    }
  }
         

    }
