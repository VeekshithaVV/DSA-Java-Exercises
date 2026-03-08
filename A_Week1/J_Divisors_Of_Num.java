//All divisors of a Number

package A_Week1;

import java.util.*;
public class J_Divisors_Of_Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        input.close();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i <= num; i++){
            if(num % i == 0){
                list.add(i);
                if(num /i != i){ //Inside the if
                    list.add(num/i);
                }
            }
        }
        Collections.sort(list);
        for(int n : list){
            System.out.print(n+" ");
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number :48
1 2 3 4 6 8 12 16 24 48 
*/
