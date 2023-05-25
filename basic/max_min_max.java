/*
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
Example 1:
Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is: 6 1 5 2 4 3.
 */

import java.util.*;

public class max_min_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int b[]=new int[n];
        int max=n-1;
        int min=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                b[i]=a[max];
                max--;
            }
            else{
                b[i]=a[min];
                min++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
