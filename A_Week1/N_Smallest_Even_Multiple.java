//Smallest Even Multiple
package A_Week1;

import java.util.*;
public class N_Smallest_Even_Multiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();

        if(num % 2 == 0){
            System.out.println(num);
            return;
        }
        System.out.println(num * 2);
    }
}

//------------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:6
6

Enter the number:3
6

*/
