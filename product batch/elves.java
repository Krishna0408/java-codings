import java.util.*;
class elves
{
public static void main(String args[])
{
int i,j;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of inputs:");
int n= sc.nextInt();
int a[]=new int[n];
System.out.print("Enter the numbers: ");

for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println();
for(i=0;i<n;i++)
{
if(i==0)
{
System.out.println(a[i]);
}
else
{
    if(a[i-1]<a[i])
    {
    System.out.println(a[i]+" (Increased)");
    }
    else
    {
    System.out.println(a[i]+" (Decreased)");
    }
    }
    }   
}
}    