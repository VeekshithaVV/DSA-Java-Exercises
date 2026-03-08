//Reversing the equation
/*
Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.
 */
package A_Week1;

import java.util.*;
public class I_Reverse_Equa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the equation:");
        String equation = input.nextLine();
        input.close();

        StringBuilder res = new StringBuilder();
        int i = equation.length()-1;

        while (i >= 0) {
            String num = "";
            while(i>=0 && Character.isDigit(equation.charAt(i))){
                num = equation.charAt(i) + num;
                i--;
            }

            res.append(num);
            if(i >= 0){
                res.append(equation.charAt(i));
                i--;
            }
        }
        System.out.println("Reverse Equation: "+res.toString());
    }
}

//-----------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the equation:20-3+5*2
Reverse Equation: 2*5+3-20
*/
//----------------------------------------------------------------------------------------------------------------------------------------
/*
Read the equation as a String.
Traverse the string from right to left.
Extract complete numbers (digits together).
Use Character.isDigit() to detect numbers.
Append the number first, then the operator.
Store result using StringBuilder.
Print the reversed equation at the end.
*/