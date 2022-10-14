import java.util.Scanner;
class A{
    public static void main(String args[]){
        int i,j,n,k;
        Scanner x = new Scanner(System.in);
        n= x.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<n-1;j++){
                System.out.print(j+"");
            }for (k=1;k<n-2;k++){
                System.out.print(k+"");
            }System.out.println("");
        }
    }
}