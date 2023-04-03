class superclass {
    int age;
    superclass(int age)
    {
        this.age=age;
    }
    public void getAge(){
        System.out.println(age);
    }
}

class subclass extends superclass{
    subclass(int age){
        super(age);
    }
    public static void main(String[] args) {
        subclass s=new subclass(20);
        s.getAge();
    }
}
