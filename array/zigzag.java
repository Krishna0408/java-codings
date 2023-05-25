/* i/p : 4 3 7 8 6 2 1
   o/p : 3 7 4 8 2 6 1
*/

import java.util.*;

public class zigzag {
public static void main(String[] args) {
   int arr[]={4,3,7,8,6,2,1};
   int n=arr.length;
   int flag = 1;  
   int temp =0;  
   for (int i=0; i<=arr.length-2; i++)  
   {  
   if (flag==1)  
   {  
   if (arr[i] > arr[i+1])  
   {  
   temp = arr[i];  
   arr[i] = arr[i+1];  
   arr[i+1] = temp;  
   }  
   flag=0;
   }  
   else  
   {  
   if (arr[i] < arr[i+1])  
   {  
   temp = arr[i];  
   arr[i] = arr[i+1];  
   arr[i+1] = temp;  
   }
   flag=1;  
   }  
   }  
   for(int i=0;i<n;i++){
   System.out.print(arr[i]+" ");
   }
   }  
   }



