public class heart {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=0;j<9;j++){
                if((i==0 && (j==2 || j==6)) || (i==1 && (j==1 || j==3 || j==5 || j==7)) 
                ||(i==2 && (j==0 || j==4 || j==8)) ||(i==3 && (j==0 || j==8)) 
                || (i==4 && (j==1 || j==7)) ||(i==5 && (j==2 || j==6)) 
                ||(i==6 && (j==3 || j==5))|| (i==7 && j==4)){
                    System.out.print(" *");
                 }
                 else{
                    System.out.print("  ");
                 }
                }System.out.println();
            }
    }
}
