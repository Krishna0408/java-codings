import java.util.*;

interface match{
    void quality();
} 

class batsman implements match{
    public void quality(){System.out.println("I am BATSMAN"); }
}

class bowler implements match{
    public void quality(){ System.out.println(" I am BOWLER too"); }
}

class batsmanbolwer{
    public static void main(String[] args) {
        match d=new bowler();
        d.quality();
    }
}