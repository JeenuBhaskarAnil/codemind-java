import java.util.Scanner;
class A{
    public static void main(String args[]){
        int i,j,n,l,k;
        Scanner x = new Scanner(System.in);
        n= x.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==i||j==n+1-i){
                System.out.print(n+1-i+" ");}
                else{
                    System.out.print(" ");
                }
    }System.out.println("");
        }
    }
}