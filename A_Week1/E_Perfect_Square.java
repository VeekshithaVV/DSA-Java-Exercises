//Perfect Square n = x × x
package A_Week1;

import java.util.*;
public class E_Perfect_Square {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = input.nextInt();

        int count = brute(n);
        //int count = optimal(n);
        System.out.println("Count of perfect square:"+count);
    }
    //Brute
    public static int brute(int num){
        int count = 0;
        for(int i=1; i*i<num; i++){
            count++;
        }
        return count;
    }

    //Optimal
    public static int optimal(int num){
        return (int)Math.sqrt(num-1);
    }
}

//---------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:9
Count of perfect square:2

1² = 1
2² = 4
3² = 9
4² = 16
*/