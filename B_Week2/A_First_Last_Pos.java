//Find First and Last Position of Element in Sorted Array

package B_Week2;

import java.util.*;

public class A_First_Last_Pos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target value:");
        int target = input.nextInt();

        //int[] res = brute(arr,n,target);
        //int[] res = better(arr, n, target);
        int[] res = optimal(arr,n,target);
        
        System.out.println("First Pos:"+res[0]);
        System.out.println("Last POs:"+res[1]);
    }
    //Brute
    public static int[] brute(int[] arr , int n, int tearget){
        //int[] res = new int[2];
        int first = -1, last = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == tearget ){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[] {first,last};
    }
    //BETTER
    public static int[] better(int[] arr , int n , int target){
        int lb = lowerBound(arr,n,target);
        if(lb == n || arr[lb] != target){
            return new int[] {-1,-1};
        }
        return new int[] {lb, upperBound(arr,n,target)-1};
    }
    public static int lowerBound(int[] arr , int n , int target){
        int ans = n;
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr , int n , int target){
        int ans = n;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    //OPTIMAL
    public static int[] optimal(int[] arr , int n , int target){
        int first = firstOccur(arr,n, target);
        if(first == -1){
            return new int[] {-1,-1};
        }
        int last = lastOccur(arr,n, target);
        return new int[] {first,last};
    }
    public static int firstOccur(int[] arr , int n , int target){
        int first = -1;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
    public static int lastOccur(int[] arr , int n , int target){
        int last = -1;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the array size:8
Enter the array elements:
1 2 3 4 4 4 6 7
Enter the target value:4
First Pos:3
Last POs:5
*/

//-------------------------------------------------------------------------------------------------------------------------
/*
BRUTE:
Time Complexity : O(N)
Space Complexity : O(1)

BETTER:
Time Complexity : 2 * O(log2 N)
Space Compleity : O(1)

OPTIMAL:
Time Compleity : 2 * O(log2 N) (if val is not there,can reduce to O(log2 N))
Space Complexity : O(1)

*/
