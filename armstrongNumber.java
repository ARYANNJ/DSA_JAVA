package java;
import java.util.*;

public class armstrongNumber {
  
    public static boolean armstrong(int num){
        int original=num;
        int sum=0;
        while(num >0){
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
       
        }
       return sum==original;
       
    }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
     System.out.println(armstrong(num));

    }
}
