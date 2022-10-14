import java.util.Scanner;
class A{
    public static void main(String args[]){
        int a,b,c,n;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=a-1;
        n=(b*(b+1))/2;
        System.out.print(n);
    }
}