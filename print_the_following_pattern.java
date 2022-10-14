import java.util.Scanner;
class A{
    public static void main(String args[]){
        int i,j,n,k;
        Scanner x = new Scanner(System.in);
        n= x.nextInt();
        for(i=1;i<n;i++){
          for(k=1;k<=n;k++){
                if (k==i || k==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("") ;
        }for (j=1;j<=n;j++){
            System.out.print("*");
        }
    }
}