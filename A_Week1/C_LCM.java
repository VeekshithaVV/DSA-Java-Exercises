//LCM (Least Common Multiple) is the smallest number that is divisible by both numbers.
/*
Example
Numbers: 5 and 7
Multiples of 5
5, 10, 15, 20, 25, 30, 35
Multiples of 7
7, 14, 21, 28, 35

LCM = 35
*/
package A_Week1;

import java.util.*;
public class C_LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value on a:");
        int a = input.nextInt();
        System.out.print("Enter the value of b:");
        int b = input.nextInt();

        int val = Math.max(a,b);
        int lcm = -1;
        while(true){
            if(val % a == 0  && val % b == 0){
                lcm = val;
                break;
            }
            val++;
        }
        System.out.println("LCM :"+lcm);
    }
}

//---------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the value on a:5
Enter the value of b:7
LCM :35
*/