
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.Arrays;
public class leet1 {
      
      static int[] twosum(int []arr , int target){
           for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1; j < arr.length; j++){
              if(arr[i] + arr[j] == target){
                 return  new int[]{i, j};
              }
            }
           }
          return  new int[0];
           
      }


  public static void main(String[] args){
           int[]nums = {2,7,5,11,22}; 
           int tar= 9;
           System.out.println(Arrays.toString(twosum(nums,tar)));
  }
}