//Prime Number : Number which is completly divisible by 1 and inself

package A_Week1;

import java.util.*;
public class B_Prime_Num{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();

        //boolean res = brute(num);
        //boolean res = optimal1(num);
        boolean res = optimal2(num);

        if(res){
            System.out.println("Prime NUmber!!");
        }
        else{
            System.out.println("Not a Prime Number!!");
        }
        
    }
    //Brute
    public static boolean brute(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
            if(count > 2){
                return false;
            }
        }
        return count==2;
    }

    //Optimal1
    public static boolean optimal1(int num){
        if(num <= 1){
            return false;
        }

        if(num == 2 || num == 3){
            return true;
        }

        if(num % 2==0 ||  num % 3 == 0){
            return false;
        }

        for(int i=5; i*i<=num; i+=6){
            if(num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    //Optimal2
    public static boolean optimal2(int num){
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
}

//-------------------------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number:4
Not a Prime Number!!

Enter the number:17
Prime NUmber!!
*/

/*
Brute:
Time Compleity : O(N)
Space Compleity : O(1)

Optimal1:
Time Compleity : O(Sqrt N)
Space Compleity : O(1)

Optimal2:
Time Compleity : O(Sqrt N)
Space Compleity : O(1)
*/