//Palindrome Digit Sum
package A_Week1;

import java.util.*;
public class K_Palindrome_Digit_Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();

        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        int n = sum;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if(sum == rev){
            System.out.println("Plaindrome Number!!");
        }
        else{
            System.out.println("Not a Plaindrome!!");
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:56
Plaindrome Number!!

Enter the number:98
Not a Plaindrome!!
*/