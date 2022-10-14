import java.util.Scanner;
class A{
    public static void main(String args[]){
        int i,j,n,k;
        Scanner x = new Scanner(System.in);
        n= x.nextInt();
        for (i=1;i<=n;i++){
            for(j=i;j<=n;j++){
              System.out.print(j+" ") ; }System.out.println("");
        }
    }
}