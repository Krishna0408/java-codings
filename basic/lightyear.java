import java.util.Scanner;
class lightyear{
    public static void main(String[] args) {
        long speed=186000;
        Scanner sc=new Scanner(System.in);
        long days=sc.nextLong();
        long seconds=days*24*60*60;
        long dist=speed*seconds;
        System.out.print(dist);
    }
}