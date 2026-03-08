//Multiplication Table
package A_Week1;

import java.util.*;
public class H_Multiplication_Table {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1; i<=10; i++){
            res.add(num * i);
        }

        for(int num1 : res){
            System.out.print(num1+" ");
        }
   } 
}

//----------------------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the number: 11
11 22 33 44 55 66 77 88 99 110 
*/