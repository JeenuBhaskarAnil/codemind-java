import java.util.Scanner;
class P{
    public static void main(String args[]){
       Scanner x=new Scanner(System.in) ;
       int n=x.nextInt();
       for(int i=n;i>=1;i--){
           for(int j=n;j>=1;j--){
               System.out.print(j+" ");
        
           }System.out.println();
       }
    }
}