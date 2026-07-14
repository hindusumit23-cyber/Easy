// arr = [0,1,0]
// Output: 1

public class leet852{
    public static void main(String[] args){
           int arr[] = {3,5,3,2,0};
           int low = 1;
           int up = arr.length - 2;
           
           while(low<=up){
         int mid = (low + up)/2 ;
         if((arr[mid] > arr[mid -1]) &&(arr[mid] > arr[mid + 1])){
            System.out.println(mid);
            break;
         }
         else if(arr[mid] < arr[mid+1]){
            low = mid + 1;
             
         }
         else{
          up = mid -1;}
           }
           
           
    }
}