import java.util.*;
public class star
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
        //System.   out.println(c);
        for(int i=0;i<count;i++){
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
    }      
}