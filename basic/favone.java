import java.util.Scanner;

public class favone {
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
		String Name1= "harish";
        String Name2= "krishna";
        String Name3= "bava";
        String Name4= "sanjai";
        String Name5= "kavin";
        String Name6= "Skndhan";
        String Name7= "nagaraj";
        System.out.println();
		if (name.equals(Name1)) {
			System.out.println("Harish Sir is the Best");
		} 
        else if(name.equals(Name2) || name.equals(Name6)){
            System.out.println("Neutal");
        }
        else if(name.equals(Name2)){
            System.out.println("Neutal");
        }
        else if(name.equals(Name3)){
            System.out.println("Thunivu");
        }
        else if(name.equals(Name4) || name.equals(Name5)){
            System.out.println("Varuisu");
        }
        else if(name.equals(Name7)) {
			System.out.println("both movies");
		}
        else{
            System.out.println("not match");
        }
        System.out.println();
    }   
}
