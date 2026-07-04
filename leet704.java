public class leet704{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int target = 2;
        int low = 0;
        int up = arr.length - 1;
        
        while(low <= up){
            int mid = (low + up)/2; 
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target){
                up = mid - 1;
            }
            else{
                low = mid + 1;
            }
           
        }
         System.out.println("No Number Exists. ");
        
        
    }
}