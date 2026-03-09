//Multiply 2 Strings

package A_Week1;

import java.math.BigInteger;
import java.util.*;
public class P_Multiple_2Str {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        String num1 = input.next();
        System.out.print("Enter the number 2: ");
        String num2 = input.next();
        input.close();

        // BigInteger a = new BigInteger(num1);
        // BigInteger b = new BigInteger(num2);
        // return a.multiply(b).toString();

        

        boolean negative = false;

        /*
        + × + = +
        + × - = -
        - × + = -
        - × - = +
        */
        if(num1.charAt(0) == '-') {
            negative = !negative;
            num1 = num1.substring(1);
        }

        if(num2.charAt(0) == '-') {
            negative = !negative;
            num2 = num2.substring(1);
        }

        int len1 = num1.length();
        int len2 = num2.length();

        if ((len1 == 1 && num1.charAt(0) == '0') || (len2 == 1 && num2.charAt(0) == '0')) {
            System.out.println(num1+" * "+num2+" = "+"0");
            return;
        }

        // remove leading zeros
        num1 = num1.replaceFirst("^0+", "");
        num2 = num2.replaceFirst("^0+", "");
        
        int[] result = new int[len1 + len2];

        for(int i=len1-1; i>=0; i--){
            for(int j=len2-1; j>=0; j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = product + result[pos2];

                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int num : result){
            if(!(num == 0 && res.length() == 0)){
                res.append(num);
            }
        }

        if(res.length() == 0){
            System.out.println(num1+" * "+num2+" = "+"0");
        }
        if(negative){
            res.insert(0, '-');
        }
        else{
            System.out.println(num1+" * "+num2+" = "+res.toString());
        }
    }
}

//--------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number 1 :14
Enter the number 2: 12
14 * 12 = 168
*/

//-------------------------------------------------------------------------------------------------------------------
/*
Time Complexity : O(N * M)
Space Complexity : O(N + M)
*/