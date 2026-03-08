//Amstrong Number
package A_Week1;
import java.util.*;
public class G_Amstrong_NUm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        G_Amstrong_NUm obj = new G_Amstrong_NUm();
        boolean res = obj.isAmstrong(num);

        if(res){
            System.out.println(num+" is Amstrong Number");
        }
        else{
            System.out.println(num+" Not a Amstrong number!!");
        }
    }
    public boolean isAmstrong(int num){
        String str = String.valueOf(num);
        int count = str.length();
        int result = 0;
        int n = num;
        while(num > 0){
            int digit = num % 10;
            result += (int)Math.pow(digit,count);
            num /= 10;
        }
        return n==result;
    }
}

//-----------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:63
63 Not a Amstrong number!!

Enter the number:153
153 is Amstrong Number

*/