import java.util.*;
class star1
{
  public static void main(String[] args) 
  {    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str =sc.nextLine();    
        int count = 0;    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
        //System.out.println(count);
        int c=(count/2);
        //System.out.println(c);
        int i,j,row=count;
        for (i=0; i<row; i++)   
{  
for (j=(row+4)-i; j>1; j--)   
{  
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{   
System.out.print("* ");   
}   
System.out.println();   
}   
        for(i=0;i<count;i++){
            if(count%2==1){
                
            if(i==c){
                System.out.print(str);
            }
            else{
               System.out.print(" * ");
            }
        }
        
        else{
            if(i==c){
            System.out.print(str+" *");
        }
        else{
            System.out.print(" * ");
        }
    }
}
System.out.println();
for( i=0;i<count;i++){
    System.out.print(" ");
}
    for(i=0;i<count;i++){
        System.out.print("*");
    }
    }      
}