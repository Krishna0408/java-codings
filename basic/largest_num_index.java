/*

Given an array, find an element before which all elements are smaller than it, and after which all are greater than it. Return the index of the element if there is such an element, otherwise, return -1.
Examples:
Input: arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9}; 
Output: 4 
Explanation: All elements on left of arr[4] are smaller than it 
and all elements on right are greater.
Input: arr[] = {5, 1, 4, 4}; 
Output: -1 
Explanation : No such index exits. 
*/

import java.util.*;

public class largest_num_index {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLeft = Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>maxLeft) { 
                maxLeft=arr[i];
            }
            if(arr[n-1-i]<minRight) {
                minRight=arr[n-1-i];  
            }
            if(maxLeft==arr[i] && minRight==arr[i]) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
