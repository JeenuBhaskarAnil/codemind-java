import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        double a,b,c,s, ar;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
}