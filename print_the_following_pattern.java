import java.util.Scanner;
class P{
    public static void main(String args[]){
       Scanner x=new Scanner(System.in) ;
       int n=x.nextInt();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if (j==i)
               System.out.print("0");
               else
               System.out.print("x");
        
           }System.out.println();
       }
    }
}