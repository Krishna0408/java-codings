class bank {
    public int get_balance(){
        return 0;
    }
}
class bankA extends bank{
    public int get_balance(){
        return 1000;
    }
}
class bankB extends bank{
    public int get_balance(){
        return 1500;
    }
}
class bankC extends bank{
    public int get_balance(){
        return 2000;
    }
}

class Bank{
    public static void main(String[] args) {
        bankA a=new bankA();
        System.out.println(a.get_balance());
        bankB b=new bankB();
        System.out.println(b.get_balance());
        bankC c=new bankC();
        System.out.println(c.get_balance());
    }
    
}
