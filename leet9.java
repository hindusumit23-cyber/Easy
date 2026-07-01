// Check whether Number is Palindrome or not.

import java.util.Scanner;

public class leet9{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        int rev = 0;
        int org = x ; 
        while(x != 0){
            
            int lastdigit = x%10;   
            rev = rev*10 + lastdigit;       
            x = x/10;    

         

          }
          
           if(org == rev){
            System.out.println("yes  palindrome");}
             else{
            System.out.println("not Palindrome");
        }
        }
       
    }
