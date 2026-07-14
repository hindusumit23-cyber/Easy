// Input: letters = ["c","f","j"], target = "a"
// Output: "c"


public class leet744{
    static char main(char arr[],char target){
        
        int low = 0;
        int up = arr.length - 1;

      while(low <= up){
        int mid = (low + up)/2;  
        if()     
        if(arr[mid]>target){
           up=mid-1;
            
        }
        else if(arr[mid]<target){
            
             low = mid + 1;
        }
        else{
            return arr[mid];
        }
       
      }
      return arr[low];
    }
    public static void main(String[] args){
         char arr[] = {'c','f','j'};
        char target = 'a';
        System.out.println(main(arr,target));
       
    }
}