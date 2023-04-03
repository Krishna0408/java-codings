import java.util.*;

public class cash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int twok=a/2000;
        int fivehundred =(a%2000)/500;
        int twohundred =((a%2000)%500)/200;
        int hundred =(((a%2000)%500)%200)/100;
        int fifty=((((a%2000)%500)%200)%100)/50;
        int twenty=(((((a%2000)%500)%200)%100)%50)/20;
        int ten=((((((a%2000)%500)%200)%100)%50)%20)/10;
        int five = (((((((a%2000)%500)%200)%100)%50)%50)%10)/5;
        int two = ((((((((a%2000)%500)%200)%100)%50)%50)%10)%5)/2;
        int one = ((((((((a%2000)%500)%200)%100)%50)%50)%10)%5)%2;
        System.out.println(twok+" "+fivehundred+" "+twohundred+" "+hundred+" "+fifty+" "+twenty+" "+ten+" "+five+" "+two+" "+one);
    }
}
