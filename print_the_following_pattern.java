import java.util.Scanner;
class P{
    public static void main(String args[]){
       Scanner x=new Scanner(System.in) ;
       int n=x.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j+"");
        
           }System.out.println();
       }
    }
}