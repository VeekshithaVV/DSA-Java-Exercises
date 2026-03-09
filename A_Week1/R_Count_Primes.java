//Count the Prime Numbers in ranage
package A_Week1;

import java.util.*;
public class R_Count_Primes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();

        if(num <= 1){
            System.out.println("Count of Prime Numbers :"+0);
            return;
        }
        //int count = brute(num);
        int count = optimal(num);
        System.out.println("Count of Prime Numbers :"+count);

    }
    //Brute
    public static int brute(int num){
        int count = 0;

        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        for(int j=2; j*j<=num; j++){
            if(num % j == 0){
                return false;
            }
        }
        return true;
    }

    //Optimal
    public static int optimal(int n){
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {

            if (!isComposite[i]) {
                count++;

                if ((long)i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isComposite[j] = true;
                    }
                }
            }
        }

        return count;
    }
}

//--------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:10
Count of Prime Numbers :4

Enter the number:50000
Count of Prime Numbers :5133
*/

//-----------------------------------------------------------------------------------------------------------------
/*
Brute:-
Time Complexity : O(N^N)
Space Complexity : O(1)

Optimal:-
Time Complexity : O(n log log n)
Space Complexity : O(n)

*/