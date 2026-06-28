// for 3 multiple Fizz
// for 5 multiple Buzz
// for Both 3 & 5 multiple FizzBuzz
import java.util.Scanner; 

public class leet412{
    public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any number : ");
          int n = sc.nextInt();
          System.out.println("FizzBuzz : ");
         for(int i=1;i<=n; i++){
      if((i%5==0)&&(i%3==0)){
         System.out.println("FizzBuzz");
       }
       else if(i%5==0){
          System.out.println("Buzz");
       }
         else if(i%3==0){
        System.out.println("Fizz");
       }
       else{
         System.out.println(i);
       }

         }
    }
}