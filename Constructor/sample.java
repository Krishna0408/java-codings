public class sample {
   
   int n;
   String name;
   int age;
   sample(int n,String name){
       this.n=n;
       this.name=name;
   }
   /*void display(){
      System.out.println(n+" "+name);
   }*/ 
   sample(int n,String name,int age){
       this.n=n;
       this.name=name;
       this.age=age;
   }
   sample(sample s1){ //for copy constructor (sample is the data type and s1 is constructor name)
      name=s1.name;
      n=s1.n;
      age=s1.age;
   }
   void display(){
       System.out.println(n+" "+name+" "+age);

}
   public static void main(String[] args) {
    sample s=new sample(1,"krish");
    sample s1=new sample(2,"Bava",19);
    sample s2=new sample(s1);
    s.display();
    s1.display();
    s2.display();
   }
}
