//Number of Common Factors
package A_Week1;

import java.util.*;
public class O_Coumt_Common_Factor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A:");
        int a = input.nextInt();
        System.out.print("Enter the value of B:");
        int b = input.nextInt();

        int min = Math.min(a,b);
        int count = 0;
        for(int i=1; i<=min; i++){
            if(a%i == 0 && b%i== 0){
                count++;
            }
        }
        System.out.println("Count of Common Factor:"+count);
    }
}

//------------------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the value of A:12
Enter the value of B:6
Count of Common Factor:4
*/