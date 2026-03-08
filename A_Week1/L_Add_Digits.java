//Add Digits
package A_Week1;

import java.util.*;
public class L_Add_Digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();

        if(num < 10){
            System.out.println("Result :"+num);
            return;
        }

        while(num > 9){
            num = sumDigit(num);
        }
        System.out.println("Result :"+num);
    }
    public static int sumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

//------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:38
Result :2


*/