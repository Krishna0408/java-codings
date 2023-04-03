import java.util.*;

interface match{
    void quality();
} 

class batsman implements match{
    public void quality(){System.out.println("I am BATSMAN"); }
}

class bowler implements match{
    public void quality(){ System.out.println("I am BOWLER too"); }
}

class bb{
    public static void main(String[] args) {
        match d1=new batsman();
        d1.quality();
        match d=new bowler();
        d.quality();
    }
}