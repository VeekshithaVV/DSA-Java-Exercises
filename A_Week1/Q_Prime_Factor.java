//A prime factor of a number is a prime number that divides the number exactly (without remainder).

package A_Week1;

import java.util.*;
public class Q_Prime_Factor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();

        //int max = brute(num);
        int max = optimal(num);
        System.out.println("Largest Prime Factor :"+ max);
    }
    public static int brute(int num){
        int max = Integer.MIN_VALUE;
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                if(num % i == 0){
                    max = Math.max(max,i);
                }
            }
        }
        return max;
    }
    public static boolean isPrime(int num){
        int count = 0;
        for(int i=1; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                count++;
            }

            if(num /i != i){
                count++;
            }
        }
        return count==2;
    }

    public static int optimal(int num){
        int i;
        int val = 1;
        for(i=2; i<=num;){
            if(num % i == 0){
                num = num/i;
                val = i;
            }
            else{
                i++;
            }
        }
        //return num;
        return val;
    }
}



//---------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:13195
Largest Prime Factor :29

Enter the number:700
Largest Prime Factor :7
2 * 2 * 5 * 7 = 700

*/

//---------------------------------------------------------------------------------------------------------------
/*
Optimal:
Time Complexity : O(log n)
SPace Complexity : O(1)
*/