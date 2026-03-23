//

package B_Week2;

import java.util.*;
public class C_Search_Rotated_Array_II {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target:");
        int target = input.nextInt();

        int low = 0 , high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                ans = mid;
                break;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low += 1;
                high -= 1;
                continue;
            }

            //Check left
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        System.out.println("Index: "+ans);
    }
}

//------------------------------------------------------------------------------------------------------------------
//OUTPUT
/*
Enter the array size:7
Enter the array elements:
4 5 6 7 0 0 1
Enter the target:0
Index: 5
*/
//--------------------------------------------------------------------------------------------------------------
/*
Handle duplicates:
👉 If arr[low] == arr[mid] == arr[high] → shrink range (low++, high--)
Check which side is sorted:
Left sorted → arr[low] <= arr[mid]
Right sorted → else case
If left sorted:
Target in range → high = mid - 1
Else → low = mid + 1
If right sorted:
Target in range → low = mid + 1
Else → high = mid - 1
Loop until low <= high
Return index if found, else -1

Time Complexity : O(N/2) worst case (3 3 3 1 3 3 3 3 t = 1)
*/