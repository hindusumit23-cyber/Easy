// power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        else{
            if((n%2 != 0) &&(n/3 >0)&&(n%3 ==0))  {
               return isPowerOfThree(n/3);
            }
            return false;
        }
    }
}