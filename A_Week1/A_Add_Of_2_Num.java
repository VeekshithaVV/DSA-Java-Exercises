//Addition of 2 Numbers

package A_Week1;

import java.util.*;
public class A_Add_Of_2_Num{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();

        System.out.println("Sum of 2 numbers:"+(num1+num2));
    }
}

//OUTPUT
/*
Enter the first number:1
Enter the second number:10
Sum of 2 numbers:11
*/