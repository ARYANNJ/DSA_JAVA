package java;
import java.util.*;
public class leet {


    


    public static void main(String[] args){
        //find number with even no of digits
        //for eg 12->2 digits
        //eg 332->3 digits
     Scanner sc=new Scanner(System.in);
     int[] arr={22,433,654,1,291,44,7654,7890};
     int evenCounter=0;
     for(int i=0;i<arr.length;i++)
     {if(arr[i]>9 && arr[i]<100){
       evenCounter++;
     }else if (arr[i]>999 && arr[i]<10000){
       evenCounter++;
     }
    }
    System.out.println(evenCounter);
    }
}
