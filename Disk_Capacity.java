import java.util.Scanner;
class A{
    public static void main(String args[]){
        int a,b,c;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        System.out.print(a*b*c*2*512);
    }
}