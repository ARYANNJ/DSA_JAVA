package java;
import java.util.*;
public class arrayList {
    
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      ArrayList<Integer> list=new ArrayList<>(10);
    //   list.add(22);
    //   list.add(33);
    //   list.add(44);
    //   list.add(55);
    //   list.add(66);
    //   list.set(0, 90);
    //   System.out.println(list.contains(33));
    //   System.out.println(list);
    for(int i=0;i<num;i++){
        list.add(sc.nextInt());
    }
    System.out.println(list);
    }





}
