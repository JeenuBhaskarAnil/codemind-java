import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        int a;
        double ar=0.0;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        ar=3.14*a*a;
        System.out.format("%.2f",ar);
    }
}