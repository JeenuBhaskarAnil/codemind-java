import java.util.Scanner;
class A{
    public static void main(String args[]){
        double a,b;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=x.nextInt();
        System.out.format("%.0f",a*b);
    }
}