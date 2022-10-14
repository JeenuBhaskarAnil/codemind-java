import java.util.Scanner;
class A{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int n =x.nextInt();
        int a=n;
        int r=0;
        while (n!=0){
            int d=n%10;
            n=n/10;
            r=r*10+d;
        }
        if (r==a){
            System.out.print("2");
        }else{
            System.out.print("1");
        }
    }
}