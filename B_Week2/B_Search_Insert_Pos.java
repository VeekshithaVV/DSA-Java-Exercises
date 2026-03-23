//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

package B_Week2;

import java.util.*;
public class B_Search_Insert_Pos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = input.nextInt();

        int index = lowerBound(arr,n,target);

        System.out.println("Index:"+index);
    }
    public static int lowerBound(int[] arr , int n , int target){
        int index = n;
        int low = 0, high = n-1;
        for(int i=0; i<n; i++){
            int mid = (low + high)/2;

            if(arr[mid] >= target){
                index = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return index;
    }
}

//-----------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the size of array:4       
Enter the array elements:
 1 3 5 6
Enter the target element:2
Index:1
*/
