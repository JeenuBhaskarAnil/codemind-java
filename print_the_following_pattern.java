import java.util.Scanner;
class A{
    public static void main(String args[]){
        int i,j,n,l,k;
        Scanner x = new Scanner(System.in);
        n= x.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>i;j--){
                System.out.print(" ");
            } 
            for (k=i-1;k>0;k--){
                System.out.print(i+"");
       } for (l=0;l<i;l++){
                System.out.print(i+"");
            }System.out.println("");
        }
    }
}