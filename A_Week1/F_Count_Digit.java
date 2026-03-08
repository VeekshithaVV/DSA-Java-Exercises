//Count Digits

package A_Week1;

import java.util.*;
public class F_Count_Digit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();

        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }

        System.out.println("Count of Digit is :"+count);
    }
}

//-------------------------------------------------------------------------------------------------------------
/*
Enter the number:1234
Count of Digit is :4
*/