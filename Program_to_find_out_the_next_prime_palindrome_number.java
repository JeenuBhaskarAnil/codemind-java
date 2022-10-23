import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x =new Scanner(System.in);
        int n=x.nextInt();
        for(int i=n+1;i<=n*100;i++){
            int c=0;
            int a=i;
            int r=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    c=c+1;
                }
            }
            while(a!=0){
                r=r*10+a%10;
                a=a/10;
            }
            if (r==i && c==0){
                System.out.print(i);
                break;
            }
        }
    }
}