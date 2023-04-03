class swapping {
    public void swap() 
{
        int a = 10;
        int b = 20;
        int temp;
	temp = a;
        a = b;
        b = temp;
System.out.println(a);
System.out.println(b);
    }

    public static void main(String args[]){
        swapping obj=new swapping();
        obj.swap();
    }
}