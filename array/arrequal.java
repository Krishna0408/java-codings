import java.util.*;
import java.util.Arrays;
class arrequal
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int m=obj.nextInt();
  int a1[]=new int[m];
  for(int i=0;i<m;i++)
  {
   a1[i]=obj.nextInt();
  }
  int n=obj.nextInt();
  int a2[]=new int[n];
  for(int i=0;i<n;i++)
  {
   a2[i]=obj.nextInt();
  }
Arrays.sort(a1);
Arrays.sort(a2);
  if(Arrays.equals(a1,a2))
   
    {
     System.out.print("yes");
     }
     else 
     {
        System.out.print("no");
      }
     }
 }