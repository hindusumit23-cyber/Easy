public class leet1295{
    public static void main(String[] args){
    
         int nums[] = {12,345,2981,6,7896};
         
         int c = 0;
         for(int i = 0; i<nums.length; i++){
          int count = 0;
            while(nums[i] > 0 ){
             nums[i] = nums[i]/10;
             count++;
            }
             
             
             if(count%2 == 0){
                c++;
         }
         }
         System.out.println(c);
    }
    }d:\DSA\sumit_practice\sumit_practice\practice\leet1672.java