//GCD (Greatest Common Divisor) is the largest number that divides both numbers without remainder.

package A_Week1;

import java.util.*;
public class D_GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value on a:");
        int a = input.nextInt();
        System.out.print("Enter the value of b:");
        int b = input.nextInt();

        int gcd = 1;
        for(int i=1;i<=Math.min(a,b); i++){
            if(a % i == 0  && b % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD :"+gcd);

        int GCD = gcd(a,b);
    }
    //Euclidean
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b , a%b);
    }
}
//-------------------------------------------------------------------------------------------------

//OUTPUT
/*
Enter the value on a:20
Enter the value of b:28
GCD :4
*/