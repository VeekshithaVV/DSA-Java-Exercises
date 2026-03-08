//Sum of all prime numbers between 1 and n

package A_Week1;

import java.util.*;
public class M_Sum_Of_Prime_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        input.close();

        int sum = 0;

        //Both loop start from 2 ,1 is not a prime number
        for(int i=2; i<=num; i++){
            //Check Prime
            int count = 0;
            for(int j=2; j*j<=i; j++){
                if(i % j == 0){
                    count++;

                    if(i/j != j){
                        count++;
                    }
                }
            }
            if(count == 0){
                sum += i;
            }
        }
        System.out.println("Sum :"+sum);
    }
}

//----------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number: 5
Sum :10  //2 + 3 + 5 = 10.

*/