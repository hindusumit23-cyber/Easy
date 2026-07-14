// Input: nums = [1,2,0] => [0,1,2]
// Output: 3
import java.util.Arrays;
public class leet41{
    public static void main(String[] args){
        int nums[] = {1,2,0};
       int i = 0;
       while(i<nums.length){
        int correct = nums[i] -1;
        if( nums[i] != nums[correct] && nums[i]>0){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
        else{
            i++;
        }
       }
       for(int j = 0; j<nums.length; j++){
        if(nums[j] != j + 1){
            System.out.println(j + 1);
        }
       }
          System.out.println(nums.length + 1);

    }
}