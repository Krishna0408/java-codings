interface match{
    void quality();
} 

class batsman implements match{
    public void quality(){System.out.println("drawing rect"); }
}

class bowler implements match{
    public void quality(){ System.out.println("drawing rect"); }
}

class batsmanbolwer{
    public static void main(String[] args) {
        match d=new batsman();
        d.quality();
    }
}