package java;
public class leetArray {
    
    
    public static int findNumbers(int[] nums,int evenCounter) {
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9 && nums[i]<100){
                evenCounter++;
            }else if(nums[i]>999 && nums[i]<10000)
            {evenCounter++;}
    }
   return evenCounter;
}
public static void main(String[] args) {
    int evenCounter=0;
    int[] nums={22,3,555,7,88};
    findNumbers(null, evenCounter);
}
}
