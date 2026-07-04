class leet258 {
    public int addDigits(int num) {
        
        
        while(num/10 >= 1 ){
           int sum = 0 ;
        while(num>0){
            int rem = num%10;
            num = num /10; 
            sum = sum + rem ; 
        }
        num = sum;
    }
    return num ; 
    }
}