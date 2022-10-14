import java.util.Scanner;
import java.lang.Math;
class A{
    public static void main(String args[]){
        int a;
        double b;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b=a*1.8+32;
        System.out.format("%.2f",b);
    }
}